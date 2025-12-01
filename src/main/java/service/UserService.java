package service;

import entity.User;
import repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public String join(User user){
        try{
            userRepository.save(user);
            return "성공했습니다";
        } catch(Exception e){
            return "실패했습니다";
        }
    }

}

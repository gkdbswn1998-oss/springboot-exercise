package springboot_exercise.demo.service;

import org.springframework.stereotype.Service;
import springboot_exercise.demo.entity.RoutineMaster;
import springboot_exercise.demo.repository.RoutineMasterRepository;

import java.util.List;

@Service
public class RoutineMasterService {

    private final RoutineMasterRepository routineMasterRepository;

    public RoutineMasterService(RoutineMasterRepository routineMasterRepository) {
        this.routineMasterRepository = routineMasterRepository;
    }

    public List<RoutineMaster> routine(){
        return routineMasterRepository.findAll();
    }
}

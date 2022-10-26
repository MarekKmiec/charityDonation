package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.charity.domain.User;
import pl.coderslab.charity.repository.UserRepository;

import java.util.List;

@Service
@Transactional
public class UserService {
  private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
       return userRepository.save(user);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}

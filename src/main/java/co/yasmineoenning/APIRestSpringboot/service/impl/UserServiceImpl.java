package co.yasmineoenning.APIRestSpringboot.service.impl;

import co.yasmineoenning.APIRestSpringboot.domain.model.User;
import co.yasmineoenning.APIRestSpringboot.service.UserService;
import co.yasmineoenning.APIRestSpringboot.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

//garanto que nao exponho minha interface de uso
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        //userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This User ID already exists.");
        }
        return userRepository.save(userToCreate);
    }
}

package co.yasmineoenning.APIRestSpringboot.service;

import co.yasmineoenning.APIRestSpringboot.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create (User userToCreate);
}

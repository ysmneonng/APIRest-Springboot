package co.yasmineoenning.APIRestSpringboot.domain.repository;

import co.yasmineoenning.APIRestSpringboot.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

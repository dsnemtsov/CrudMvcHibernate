package web.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

public interface UserService {

    @Transactional(readOnly = true)
    List<User> findAll();

    @Transactional(readOnly = true)
    User findById(long id);

    @Transactional
    void save(User user);

    @Transactional
    void update(long id, User updatedUser);

    @Transactional
    void delete(long id);
}

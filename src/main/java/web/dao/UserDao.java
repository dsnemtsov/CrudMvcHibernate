package web.dao;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

public interface UserDao {
    @Transactional
    List<User> findAll();

    @Transactional
    User findById(long id);

    @Transactional
    void save(User user);

    @Transactional
    void update(long id, User updatedUser);

    @Transactional
    void delete(long id);
}

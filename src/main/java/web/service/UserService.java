package web.service;

import java.util.List;
import web.model.User;

public interface UserService {

    List<User> findAll();

    User findById(long id);

    void save(User user);

    void update(long id, User updatedUser);

    void delete(long id);
}

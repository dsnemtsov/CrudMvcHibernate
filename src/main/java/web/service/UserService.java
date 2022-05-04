package web.service;

import java.util.List;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

@Service
public class UserService {

    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(long id) {
        return userDao.findById(id);
    }

    public void save(User user) {
        userDao.save(user);
    }

    public void update(long id, User updatedUser) {
        userDao.update(id, updatedUser);
    }

    public void delete(long id) {
        userDao.delete(id);
    }
}

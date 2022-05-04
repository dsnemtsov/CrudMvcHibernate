package web.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List<User> findAll() {
        return entityManager.createQuery("from User").getResultList();
    }

    @Transactional
    public User findById(long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Transactional
    public void update(long id, User updatedUser) {
        User user = findById(id);
        user.setUserName(updatedUser.getUserName());
        user.setAge(updatedUser.getAge());
        entityManager.merge(user);
    }

    @Transactional
    public void delete(long id) {
        entityManager.remove(findById(id));
    }
}

package org.emna.webmail.dao.org.emna.webmail.dao.Impl;
import org.emna.webmail.dao.UserDao;
import org.emna.webmail.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/*** Created by formation on 05/12/2016.*/

@Component("userDao")
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void create(User user) {
        entityManager.merge(user);
    }

    public User getById(int id) {
        return entityManager.find(User.class, id);
    }

    public List<User> getAll() {
        List<User> users;
        String query= "SELECT user FROM users user";
        users= (List<User>)entityManager.createQuery(query).getResultList();
        return users;
    }

    public void delete(int id) {
        User attached=entityManager.find(User.class,id);
        entityManager.remove(attached);
    }

}

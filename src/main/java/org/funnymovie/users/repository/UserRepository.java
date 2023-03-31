package org.funnymovie.users.repository;

import org.funnymovie.users.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class UserRepository {
    @PersistenceContext
    public EntityManager entityManager;

    public User findByEmail(String email) {
        List<User> userList = entityManager.createNamedQuery("Users.findByEmail", User.class).setParameter("email", email).getResultList();
        return userList.size() == 0 ? null : userList.get(0);
    }

    public User findByEmailAndPassword(String email, String password) {
        List<User> userList = entityManager.createNamedQuery("Users.findByEmailAndPassword", User.class).setParameter("email", email).setParameter("password", password)
                .getResultList();
        return userList.size() == 0 ? null : userList.get(0);
    }

    public User findById(String id) {
        List<User> userList = entityManager.createNamedQuery("Users.findById", User.class).setParameter("id", id)
                .getResultList();
        return userList.size() == 0 ? null : userList.get(0);
    }
    @Transactional
    public void create(User user) {
        entityManager.persist(user);
    }
}

package org.funnymovie.users.repository;

import org.funnymovie.users.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Optional;

@ApplicationScoped
public class UserRepository {
    @PersistenceContext
    public EntityManager entityManager;

    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(entityManager.createNamedQuery("Users.findByEmail", User.class).setParameter("email", email)
                .getSingleResult());
    }

    public Optional<User> findByEmailAndPassword(String email, String password) {
        return Optional.ofNullable(entityManager.createNamedQuery("Users.findByEmailAndPassword", User.class).setParameter("email", email).setParameter("password", password)
                .getSingleResult());
    }

    public Optional<User> findById(String id) {
        return Optional.ofNullable(entityManager.createNamedQuery("Users.findById", User.class).setParameter("id", id)
                .getSingleResult());
    }

    public void create(User user) {
        entityManager.persist(user);
    }
}

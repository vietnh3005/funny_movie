package org.funnymovie.users.repository;

import com.oracle.svm.core.annotate.Inject;
import org.funnymovie.users.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import java.util.Optional;

@ApplicationScoped
public class UserRepository {
    @Inject
    public EntityManager entityManager;

    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(entityManager.createNamedQuery("Users.findByEmail", User.class)
                .getSingleResult());
    }

    public Optional<User> findByEmailAndPassword(String email, String password) {
        return Optional.ofNullable(entityManager.createNamedQuery("Users.findByEmailAndPassword", User.class)
                .getSingleResult());
    }

    public Optional<User> findById(String id) {
        return Optional.ofNullable(entityManager.createNamedQuery("Users.findById", User.class)
                .getSingleResult());
    }

    public void create(User user) {
        entityManager.persist(user);
    }
}

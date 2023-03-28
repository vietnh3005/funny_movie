package org.funnymovie.users;

import org.funnymovie.users.entity.User;
import org.funnymovie.users.repository.UserRepository;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mockito;

import javax.persistence.EntityManager;

public class UserRepositoryTest {
    User user;
    UserRepository userRepository;

    @BeforeAll
    void setup() {
        user = new User();
        user.setEmail("abc@kmail.com");
        user.setPassword("password");
        userRepository = new UserRepository();
        userRepository.entityManager = Mockito.mock(EntityManager.class);
        userRepository.entityManager.persist(user);
    }
}

package org.funnymovie.users;

import org.funnymovie.users.entity.User;
import org.funnymovie.users.repository.UserRepository;
import org.funnymovie.users.service.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

public class UserServiceTest {
    User user;
    UserService userService;

    @BeforeAll
    void setup() {
        user = new User();
        userService = new UserService();
        userService.userRepository = Mockito.mock(UserRepository.class);
    }
}

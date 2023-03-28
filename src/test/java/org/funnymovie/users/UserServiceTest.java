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

    @Test
    void loginTest() {
        Mockito.when(userService.userRepository.findByEmailAndPassword(Mockito.any(), Mockito.any())).thenReturn(Optional.ofNullable(user));
        userService.login(user);
        Mockito.verify(userService).login(user);
    }

    @Test
    void registerTest() {
        Mockito.when(userService.userRepository.findByEmail(Mockito.any())).thenReturn(Optional.ofNullable(user));
        userService.register(user);
        Mockito.verify(userService).register(user);
    }
}

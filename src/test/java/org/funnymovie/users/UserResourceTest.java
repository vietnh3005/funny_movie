package org.funnymovie.users;

import org.funnymovie.users.entity.User;
import org.funnymovie.users.resource.UserResource;
import org.funnymovie.users.service.UserService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class UserResourceTest {

    UserResource userResource;
    User user;

    @BeforeAll
    void setup() {
        user = new User();
        userResource = new UserResource();
        userResource.userService = Mockito.mock(UserService.class);
    }
    @Test
     void loginTest() {
        userResource.login(user);
        Mockito.verify(userResource).login(user);
    }
    @Test
    void register() {
        userResource.register(user);
        Mockito.verify(userResource).register(user);
    }
}

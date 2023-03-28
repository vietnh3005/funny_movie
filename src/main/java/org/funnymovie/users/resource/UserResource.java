package org.funnymovie.users.resource;


import org.funnymovie.users.entity.User;
import org.funnymovie.users.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/user")
public class UserResource {

    @Inject
    private UserService userService;

    @POST
    @Path("/login")
    public User login(User user) {
        return userService.login(user);
    }

    @POST
    @Path("/register")
    public void register(@Valid User user ) {
        userService.register(user);
    }
}

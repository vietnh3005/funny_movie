package org.funnymovie.users.resource;


import org.funnymovie.users.entity.User;
import org.funnymovie.users.service.UserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/users")
@Produces("application/json")
@Consumes("application/json")
public class UserResource {

    @Inject
    public UserService userService;

    @POST
    @Path("/login")
    public Response login(User user) {
        User authorizedUser = userService.login(user);
        return Response.status(200).entity(authorizedUser).build();
    }

    @POST
    @Path("/register")
    public Response register(@Valid User user ) {
        userService.register(user);
        return Response.status(201).build();
    }
}

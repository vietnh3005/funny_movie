package org.funnymovie.movies.resource;


import org.funnymovie.users.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.POST;

@ApplicationScoped
public class MovieResource {

    @POST
    public User login() {
        return new User();
    }

    @POST
    public User register() {
        return new User();
    }
}

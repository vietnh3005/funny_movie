package org.funnymovie.users.service;

import org.funnymovie.users.entity.User;
import org.funnymovie.users.repository.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class UserService {
    @Inject
    public UserRepository userRepository;

    public Response authorize(User user) {
        User loginUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if (loginUser != null) {
            return Response.status(200).entity("Logged in!!").entity(loginUser).build();
        }

        User registeredUser = userRepository.findByEmail(user.getEmail());
        if (registeredUser == null) {
            userRepository.create(user);
            return Response.status(201).entity("New user has been created").entity(user).build();
        } else {
            return Response.status(400).entity("This email has been used! Try again.").build();
        }
    }
}

package org.funnymovie.users.service;

import org.funnymovie.users.entity.User;
import org.funnymovie.users.repository.UserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Optional;

@ApplicationScoped
public class UserService {
    @Inject
    public UserRepository userRepository;

    public User login(User user) {
        Optional<User> loginUser = userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
        if(loginUser.get() != null) return loginUser.get();
        return null;
    }

    public void register(User user) {
        if(!userRepository.findByEmail(user.getEmail()).isPresent()) {
            userRepository.create(user);
        }
    }
}

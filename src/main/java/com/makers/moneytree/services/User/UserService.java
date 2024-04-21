package com.makers.moneytree.services.User;

import com.makers.moneytree.model.User.User;
import com.makers.moneytree.repository.User.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String saveUser(User user) {

        Optional<User> userFound = userRepository.findByEmail(user.getEmail());

        if (userFound.isPresent()) {
            return "Email already exists";
        }
        userRepository.save(user);
        return user.toString() + "added";
    }

    public Optional<User> findUserByName(String name) {
        return userRepository.findById(name);
    }

    public Optional<User> findUserLogIn(User user) {
        return userRepository.findByEmail(user.getEmail())
                .filter(u -> u.getPassword().equals(user.getPassword()));

    }
}

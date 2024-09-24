package com.keerthi.SpringBoot_demo.service;

import com.keerthi.SpringBoot_demo.model.User;
import com.keerthi.SpringBoot_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String saveUser(User user) {
        if(userRepository.existsByUsername(user.getUsername()))
            return "Username already exists";
        else {
            userRepository.save(user);
            return "Saved";
        }
    }

    public boolean checkUser(User userData) {
        Optional<User> user = Optional.ofNullable(userRepository.findByUsernameAndPassword(userData.getUsername(), userData.getPassword()));
        return user.isPresent();
    }

    public User readUser(int id) {
        return userRepository.getReferenceById(id);
    }

    public String updateUser(User user) {
        if(userRepository.existsById(user.getId())) {
            Optional<User> userData = userRepository.findById(user.getId());
            if(userData.isPresent()) {
                User existingUser = userData.get();
                existingUser.setName(user.getName());
                existingUser.setUsername(user.getUsername());
                existingUser.setPassword(user.getPassword());
                userRepository.save(existingUser);
                return "Updated";
            }
            else
                return "User not found";
        }
        else
            return "User not found";
    }

    public String deleteUser(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return "User Deleted";
        }
        else
            return "User not found";
    }
}
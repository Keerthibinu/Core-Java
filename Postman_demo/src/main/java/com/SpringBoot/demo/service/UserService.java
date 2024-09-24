package com.SpringBoot.demo.service;

import com.SpringBoot.demo.model.User;
import com.SpringBoot.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository repo;
    public void createUser(User user) {
        repo.save(user);
    }

    public User readUser(int id) {
        return repo.getReferenceById(id);
    }

    public String updateUser(User user) {
        if(repo.existsById(user.getId())) {
            Optional<User> userData = repo.findById(user.getId());
            User existingUser = userData.get();
            existingUser.setName(user.getName());
            existingUser.setUsername(user.getUsername());
            existingUser.setPassword(user.getPassword());
            repo.save(existingUser);
            return "Updated";
        }
        else
            return "User not found";
    }

    public String deleteUser(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "User Deleted";
        }
        else
            return "User not found";
    }

}

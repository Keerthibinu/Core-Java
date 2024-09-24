package com.keerthi.SpringBoot_demo.repository;

import com.keerthi.SpringBoot_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsernameAndPassword(String username, String password);

    boolean existsByUsername(String username);
}

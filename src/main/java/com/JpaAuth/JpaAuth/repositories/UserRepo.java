package com.JpaAuth.JpaAuth.repositories;

import com.JpaAuth.JpaAuth.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User,Integer> {
    Optional<User> findByEmail(String email);
    //Optional<User> findByFirstName(String firstName);
}

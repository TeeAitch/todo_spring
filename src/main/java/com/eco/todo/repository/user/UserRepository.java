package com.eco.todo.repository.user;

import com.eco.todo.model.user.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, UUID>{
    Optional<Users> findByUsername(String username);
    Optional<Users> findByFirstName(String firstName);
    Optional<Users> findByLastName(String lastName);
}

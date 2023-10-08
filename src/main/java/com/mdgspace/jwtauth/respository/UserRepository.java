package com.mdgspace.jwtauth.respository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdgspace.jwtauth.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    Optional<User> findByUsername(String Username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String Email);
}

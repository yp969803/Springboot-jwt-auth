package com.mdgspace.jwtauth.respository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdgspace.jwtauth.models.ERole;
import com.mdgspace.jwtauth.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{
    Optional<Role> findByName(ERole name);
}

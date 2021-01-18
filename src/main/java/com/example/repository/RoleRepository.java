package com.example.repository;

import java.util.Optional;

import com.example.model.RoleName;
import com.example.model.Roles;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Roles, Long> {
    Optional<Roles> findByName(RoleName roleName);
}
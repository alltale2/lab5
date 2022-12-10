package com.example.webapl.repos;


import com.example.webapl.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UsersRep extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}

package com.example.testbasespring.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testbasespring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
   List<User> findAllByEmail(String email);

   Optional<User> findByEmail(String email);
}
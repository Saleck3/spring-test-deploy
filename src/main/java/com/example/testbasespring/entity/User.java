package com.example.testbasespring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "users")
@Getter
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "email")
   private String email;

   @Column(name = "password")
   private String password;

   @Column(name = "first_name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;
}

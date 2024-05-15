package com.example.testbasespring.home;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testbasespring.entity.User;
import com.example.testbasespring.repositories.UserRepository;

@RestController
public class HomeController {

   @Autowired
   private UserRepository userRepository;

   @GetMapping
   public String home() {

      Optional<User> user = userRepository.findById(1);
      return user.map(value -> "Hello World! User is " + value.getFirstName()).orElse("Hello World! without user");
   }

}

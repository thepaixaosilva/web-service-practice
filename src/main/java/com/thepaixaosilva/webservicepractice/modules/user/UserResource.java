package com.thepaixaosilva.webservicepractice.modules.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User u = new User(1L, "Name of the user", "Email of the user", "Phone number of the user", "Password of the user");
    return ResponseEntity.ok().body(u);
  }
}

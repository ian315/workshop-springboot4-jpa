package com.cursoeducandoweb.cursospring.resources;

import com.cursoeducandoweb.cursospring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> getUser() {
        User user = new User(1, "Maria", "maria@gmail.com", "999", "1234");
        return ResponseEntity.ok(user);
    }
}

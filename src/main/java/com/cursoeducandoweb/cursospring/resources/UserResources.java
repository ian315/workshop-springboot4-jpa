package com.cursoeducandoweb.cursospring.resources;

import com.cursoeducandoweb.cursospring.entities.User;
import com.cursoeducandoweb.cursospring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getUser() {
        List<User> userList = userService.findAll();
        return ResponseEntity.ok().body(userList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }
}

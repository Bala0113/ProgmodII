package com.pte.progmodii.controller;

import com.pte.progmodii.model.User;
import com.pte.progmodii.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class crudApi {
    UserService userService;

    public crudApi(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@RequestBody Integer userId){
        User user = userService.readUser(userId);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody User newUser){
        User user = userService.createUser(newUser);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping
    public ResponseEntity<Boolean> deleteUser(@RequestBody User newUser){
        boolean user = userService.deleteUser(newUser);
        return ResponseEntity.ok(user);
    }

    @PutMapping
    public ResponseEntity<User> modifyUser(@RequestBody User newUser) {
        User user = userService.updateUser(newUser);
        return ResponseEntity.ok(user);
    }
}

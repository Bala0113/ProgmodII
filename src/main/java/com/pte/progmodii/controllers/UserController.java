package com.pte.progmodii.controllers;

import com.pte.progmodii.model.User;
import com.pte.progmodii.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping          //input: name
    public ResponseEntity<User> getUser(@RequestBody User userName){
        User user = userService.readUser(userName);
        return ResponseEntity.ok(user);
    }

    @PostMapping        //input: name,email,number,age,address
    public ResponseEntity<User> addNewUser(@RequestBody User newUser){
        User user = userService.createUser(newUser);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping      //input: id
    public ResponseEntity<Boolean> deleteUser(@RequestBody User newUser){
        boolean user = userService.deleteUser(newUser);
        return ResponseEntity.ok(user);
    }

    @PutMapping         //input: id,name,email,number,age,address
    public ResponseEntity<User> modifyUser(@RequestBody User newUser) {
        User user = userService.updateUser(newUser);
        return ResponseEntity.ok(user);
    }
}

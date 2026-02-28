package com.auth_service.auth_service.controller;

import com.auth_service.auth_service.DTO.UserDTO;
import com.auth_service.auth_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getByUserName/{userName}")
    public ResponseEntity<UserDTO> fetchUserById(@PathVariable String userName) {
//        UserDTO fetchedUser = userService.fetchUserById(id);
        UserDTO fetchedUser = userService.getUserByUserName(userName);
        return ResponseEntity.ok(fetchedUser);
    }

    @PostMapping("/add")
    public ResponseEntity<UserDTO> addUser(@RequestBody UserDTO userDTO) {
        UserDTO userSaved = userService.addUserToRepo(userDTO);
        return ResponseEntity.ok().body(userSaved);
    }
}

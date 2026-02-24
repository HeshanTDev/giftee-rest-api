package com.heshant.giftshop.controller;

import com.heshant.giftshop.dto.request.UserRequestDTO;
import com.heshant.giftshop.dto.response.UserResponseDTO;
import com.heshant.giftshop.service.UserService;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class UserController {

    private final UserService userService;
    private final ResourceLoader resourceLoader;

    public UserController(UserService userService, ResourceLoader resourceLoader) {
        this.userService = userService;
        this.resourceLoader = resourceLoader;
    }

    @GetMapping("users")
    public ResponseEntity<List<UserResponseDTO>> getAllUsers() {
        List<UserResponseDTO> users = userService.getAllUsers();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping("users/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable int id) {
        UserResponseDTO user = userService.getUserById(id);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("users")
    public ResponseEntity<UserResponseDTO> createUser(@PathVariable UserRequestDTO userRequest) {
        UserResponseDTO user = userService.createUser(userRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }


    @PutMapping("users/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable int id, @RequestBody UserRequestDTO userData) {
        UserResponseDTO user = userService.updateUser(id, userData);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("users/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}

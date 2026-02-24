package com.heshant.giftshop.service.impl;

import com.heshant.giftshop.dto.request.UserRequestDTO;
import com.heshant.giftshop.dto.response.UserResponseDTO;
import com.heshant.giftshop.entity.User;
import com.heshant.giftshop.repository.UserRepository;
import com.heshant.giftshop.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        List<User> allUsers = userRepository.findAll();

        List<UserResponseDTO> responses = new ArrayList<>();
        return null;
    }

    @Override
    public UserResponseDTO getUserById(int id) {
        return null;
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO userRequest) {
        return null;
    }

    @Override
    public UserResponseDTO updateUser(int id, UserRequestDTO userData) {
        return null;
    }

    @Override
    public void deleteUser(int id) {}
}

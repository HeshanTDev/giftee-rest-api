package com.heshant.giftshop.service.impl;

import com.heshant.giftshop.dto.response.UserResponseDTO;
import com.heshant.giftshop.repository.UserRepository;
import com.heshant.giftshop.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return List.of();
    }
}

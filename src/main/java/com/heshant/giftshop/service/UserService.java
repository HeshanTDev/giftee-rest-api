package com.heshant.giftshop.service;


import com.heshant.giftshop.dto.request.UserRequestDTO;
import com.heshant.giftshop.dto.response.UserResponseDTO;

import java.util.List;

public interface UserService {
    List<UserResponseDTO> getAllUsers();

    UserResponseDTO getUserById(int id);

    UserResponseDTO createUser(UserRequestDTO userRequest);

    UserResponseDTO updateUser(int id,UserRequestDTO userData);

    void deleteUser(int id);

}

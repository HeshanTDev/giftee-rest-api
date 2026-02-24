package com.heshant.giftshop.service;


import com.heshant.giftshop.dto.response.UserResponseDTO;

import java.util.List;

public interface UserService {
    List<UserResponseDTO> getAllUsers();
}

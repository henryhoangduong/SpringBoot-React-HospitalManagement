package com.hms.backend.service.impl;

import com.hms.backend.dto.UserDTO;
import com.hms.backend.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public void registerUser(UserDTO userDTO) {

    }

    @Override
    public UserDTO loginUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO getUserById(Long id) {
        return null;
    }

    @Override
    public void updateUser(UserDTO userDTO) {

    }
}

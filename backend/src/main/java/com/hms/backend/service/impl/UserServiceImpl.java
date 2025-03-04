package com.hms.backend.service.impl;

import com.hms.backend.dto.UserDTO;
import com.hms.backend.entity.User;
import com.hms.backend.exception.HMSException;
import com.hms.backend.repository.UserRepository;
import com.hms.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(UserDTO userDTO) throws HMSException {
        Optional<User> optionalUser = userRepository.findByEmail(userDTO.getEmail());
        if (optionalUser.isPresent()) {
            throw new HMSException("USER_ALREADY_EXISTS");
        }
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userRepository.save(userDTO.toEntity());

    }

    @Override
    public UserDTO loginUser(UserDTO userDTO) throws HMSException {
        return null;
    }

    @Override
    public UserDTO getUserById(Long id) throws HMSException {
        return null;
    }

    @Override
    public void updateUser(UserDTO userDTO) throws HMSException {

    }
}

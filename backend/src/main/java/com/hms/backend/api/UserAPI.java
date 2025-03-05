package com.hms.backend.api;

import com.hms.backend.dto.ResponseDTO;
import com.hms.backend.dto.UserDTO;
import com.hms.backend.exception.HMSException;
import com.hms.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Validated
@CrossOrigin
public class UserAPI {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<ResponseDTO> registerUser(@RequestBody  UserDTO userDTO)throws HMSException {
        userService.registerUser(userDTO);
        return new ResponseEntity<>(new ResponseDTO("user created"), HttpStatus.CREATED);
    }
}

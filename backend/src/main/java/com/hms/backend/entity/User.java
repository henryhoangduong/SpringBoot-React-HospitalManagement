package com.hms.backend.entity;

import com.hms.backend.dto.Roles;
import com.hms.backend.dto.UserDTO;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true )
    private String email;
    private String password;
    private Roles role;

    public UserDTO toDTO(){
        return new UserDTO(this.id,this.name,this.email,this.password,this.role);
    }
}

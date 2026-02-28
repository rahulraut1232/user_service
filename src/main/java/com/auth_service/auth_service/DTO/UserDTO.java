package com.auth_service.auth_service.DTO;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String username;

    private String password;

    private String email;

    private String firstName;

    private String lastName;

    private String address;

    private String city;

    private String state;
}

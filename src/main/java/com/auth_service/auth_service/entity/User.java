package com.auth_service.auth_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;
        @Column(nullable = false, unique = true)
        private String username;
        @Column(nullable = false)
        private String password;
        @Column(nullable = false)
        private String email;
        @Column(nullable = false)
        private String firstName;
        @Column(nullable = false)
        private String lastName;
        @Column(nullable = false)
        private String address;
        @Column(nullable = false)
        private String city;
        @Column(nullable = false)
        private String state;
}

package com.auth_service.auth_service.service;

import com.auth_service.auth_service.DTO.UserDTO;
import com.auth_service.auth_service.entity.User;
import com.auth_service.auth_service.mapper.UserMapper;
import com.auth_service.auth_service.repo.UserRepo;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserDTO addUserToRepo(UserDTO userDTO) {
        User savedUser = userRepo.save(UserMapper.MAPPER.toUser(userDTO));
        return UserMapper.MAPPER.toUserDTO(savedUser);
    }

    public UserDTO fetchUserById(Integer id) {
        Optional<User> fetchedUser = userRepo.findById(String.valueOf(id));
        return UserMapper.MAPPER.toUserDTO(fetchedUser.get());
    }

    public UserDTO getUserByUserName(String userName) {
        User fetchedUser = userRepo.getUserByUserName(userName);
        return UserMapper.MAPPER.toUserDTO(fetchedUser);
    }
}

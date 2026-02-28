package com.auth_service.auth_service.mapper;

import com.auth_service.auth_service.DTO.UserDTO;
import com.auth_service.auth_service.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
    UserDTO toUserDTO(User user);
    User toUser(UserDTO userDTO);
}

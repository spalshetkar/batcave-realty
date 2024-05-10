package com.satpalshetkar.user.mapper;

import com.satpalshetkar.user.dto.UserPasswordRequestDto;
import com.satpalshetkar.user.dto.UserRequestDto;
import com.satpalshetkar.user.model.User;
import com.satpalshetkar.user.dto.UserResponseDto;
import org.mapstruct.*;

@Mapper
public abstract class UserMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    @Mapping(source = "profilePictureUrl", target = "profilePictureUrl")
    @Mapping(source = "role", target = "role")
    public abstract UserResponseDto userToDto(User user);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    @Mapping(source = "profilePictureUrl", target = "profilePictureUrl")
    @Mapping(source = "role", target = "role")
    public abstract User dtoToUser(UserRequestDto userRequestDto);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    public abstract User passwordDtoToUser(UserPasswordRequestDto userPasswordRequestDto);
}
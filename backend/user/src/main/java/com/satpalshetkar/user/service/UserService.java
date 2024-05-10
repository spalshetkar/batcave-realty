package com.satpalshetkar.user.service;

import com.satpalshetkar.user.dto.UserRequestDto;
import com.satpalshetkar.user.mapper.UserMapper;
import com.satpalshetkar.user.dto.UserResponseDto;
import com.satpalshetkar.user.model.User;
import com.satpalshetkar.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public record UserService(UserRepository userRepository, UserMapper userMapper) {
    public UserResponseDto registerUser(UserRequestDto userRequestDto) {
        User user = userMapper.dtoToUser(userRequestDto);
        User savedUser = userRepository.save(user);
        return userMapper.userToDto(savedUser);
    }

    public UserResponseDto loginUser(UserRequestDto userRequestDto) {
        User user = userMapper.dtoToUser(userRequestDto);
        Optional<User> loginUser = userRepository.findById(user.getId());
        return userMapper.userToDto(loginUser.get());
    }
}

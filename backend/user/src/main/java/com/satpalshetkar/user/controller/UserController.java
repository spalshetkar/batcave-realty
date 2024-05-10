package com.satpalshetkar.user.controller;

import com.satpalshetkar.user.dto.UserPasswordRequestDto;
import com.satpalshetkar.user.dto.UserRequestDto;
import com.satpalshetkar.user.dto.UserResponseDto;
import com.satpalshetkar.user.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user/")
public record UserController(UserService userService) {
    @PostMapping("/register")
    public @ResponseBody UserResponseDto registerUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.registerUser(userRequestDto);
    }

    @PostMapping("/login/")
    public @ResponseBody UserResponseDto loginUser(@RequestBody UserRequestDto userRequestDto) {
        return userService.loginUser(userRequestDto);
    }

//    @PostMapping("/logout/")
//    public @ResponseBody UserResponseDto logoutUser(@RequestBody UserRequestDto userRequestDto) {
//        return userService.logoutUser(userRequestDto);
//    }
//
//    @GetMapping("/user/{userId}")
//    public @ResponseBody UserResponseDto getUser(@PathVariable Long userId) {
//        return userService.getUser(userId);
//    }
//
//    @GetMapping("/all-users/")
//    public @ResponseBody List<UserResponseDto> getAllUsers() {
//        return userService.getAllUsers();
//    }
//
//    @PutMapping("/{userId}")
//    public @ResponseBody UserResponseDto updateUser(@PathVariable Long userId, @RequestBody UserRequestDto userRequestDto) {
//        return userService.updateUser(userId, userRequestDto);
//    }
//
//    @DeleteMapping("/{userId}")
//    public void deleteUser(@PathVariable Long userId) {
//        return userService.deleteUser(userId);
//    }
//
//    @PutMapping("/change-password/")
//    public @ResponseBody UserResponseDto changePassword(@RequestBody UserPasswordRequestDto userPasswordRequestDto) {
//        return userService.changePassword(userPasswordRequestDto);
//    }



}

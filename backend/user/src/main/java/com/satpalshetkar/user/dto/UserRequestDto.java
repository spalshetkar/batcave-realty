package com.satpalshetkar.user.dto;

import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDto implements Serializable {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private String profilePictureUrl;
    private String role;
}
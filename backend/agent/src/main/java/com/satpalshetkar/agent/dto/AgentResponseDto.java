package com.satpalshetkar.agent.dto;

import jakarta.annotation.security.DenyAll;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgentResponseDto {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String licenseNumber;
    private String profilePictureUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

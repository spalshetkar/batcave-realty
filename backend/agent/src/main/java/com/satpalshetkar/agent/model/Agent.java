package com.satpalshetkar.agent.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "agent")
public class Agent {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "agent_id_generator"
    )
    @SequenceGenerator(
            name = "agent_id_generator",
            sequenceName = "agent_id_generator"
    )
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String licenseNumber;
    private String profilePictureUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

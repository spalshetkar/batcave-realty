package com.satpalshetkar.user.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_generator"
    )
    @SequenceGenerator(
            name = "user_id_generator",
            sequenceName = "user_id_generator"
    )
    private Long id;
    private String username;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private String profilePictureUrl;
    private String role;
}

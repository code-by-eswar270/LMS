package com.Project.lms_backend.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor // No-arg constructor
@AllArgsConstructor // All-arg constructor
@Builder // Builder pattern support
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    private Boolean active = true;

    private LocalDateTime createdAt = LocalDateTime.now();
}

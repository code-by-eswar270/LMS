package com.Project.lms_backend.model;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "penalties")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Penalty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "emi_id", nullable = false)
    private EMI emi;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(columnDefinition = "TEXT")
    private String reason;

    @Column(name = "issued_date", nullable = false)
    private LocalDateTime issuedDate = LocalDateTime.now();
}


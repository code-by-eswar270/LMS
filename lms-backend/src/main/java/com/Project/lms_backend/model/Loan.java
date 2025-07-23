package com.Project.lms_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "loans")
@Data
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;  // Applicant

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private LoanProduct product;

    @Column(precision = 15, scale = 2)
    private Double amount;

    @Column(name = "term_months")
    private Integer termMonths;

    @Column(name = "interest_rate", precision = 5, scale = 2)
    private Double interestRate;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private LoanStatus status = LoanStatus.PENDING;

    @Column(columnDefinition = "TEXT")
    private String purpose;

    @Column(name = "created_at", updatable = false)
    private java.time.LocalDateTime createdAt = java.time.LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "reviewed_by", referencedColumnName = "id")
    private User reviewedBy;  // Officer/Admin reviewer

    @Column(columnDefinition = "TEXT")
    private String reason;  // Rejection reason if applicable

    // Enum for LoanStatus
    public enum LoanStatus {
        PENDING,
        APPROVED,
        REJECTED
    }
}

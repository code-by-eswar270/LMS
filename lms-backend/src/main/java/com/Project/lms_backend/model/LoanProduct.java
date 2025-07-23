package com.Project.lms_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "loan_products")
@Data
public class LoanProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "interest_rate", precision = 5, scale = 2)
    private Double interestRate;

    @Column(name = "min_amount", precision = 15, scale = 2)
    private Double minAmount;

    @Column(name = "max_amount", precision = 15, scale = 2)
    private Double maxAmount;

    @Column(name = "tenure_months", nullable = false)
    private Integer tenureMonths;
}

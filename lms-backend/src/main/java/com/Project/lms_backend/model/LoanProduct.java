package com.Project.lms_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    @Column(name = "interest_rate")
    private Double interestRate;

    @Column(name = "min_amount")
    private Double minAmount;

    @Column(name = "max_amount")
    private Double maxAmount;

    @Column(name = "tenure_months", nullable = false)
    private Integer tenureMonths;
}

package com.customerservice.customerservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Document(collection = "customers")
public class Customer {

    @Id
    private String id;
    private String tenantId;

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate dateOfBirth;

    private CustomerStatus status;
    private Instant createdAt;
    private Instant updatedAt;

    private List<String> accountIds; // optional reference to accounts


    public enum CustomerStatus {
        ACTIVE,
        INACTIVE,
        SUSPENDED
    }
}
package com.example.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // No-arg constructor
    public User() {}

    // Constructor with fields
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // ✅ Add getter for name
    public String getName() {
        return name;
    }

    // ✅ Add setter for name
    public void setName(String name) {
        this.name = name;
    }

    // ✅ Add getter for email
    public String getEmail() {
        return email;
    }

    // ✅ Add setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

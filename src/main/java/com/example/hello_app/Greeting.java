package com.example.hello_app;

import jakarta.persistence.*;

@Entity
@Table(name = "greetings")
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lang_code", unique = true, nullable = false)
    private String langCode;

    @Column(nullable = false)
    private String message;

    public String getMessage() {
        return message;
    }

    // getters and setters
}

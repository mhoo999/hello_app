package com.example.hello_app;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GreetingRepository extends JpaRepository<Greeting, Long> {
    Optional<Greeting> findByLangCode(String langCode);
}

package com.example.hello_app;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final GreetingRepository repository;

    public GreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    public String getMessageByLang(String langCode) {
        return repository.findByLangCode(langCode)
                .map(Greeting::getMessage)
                .orElse("Unknown Language");
    }
}

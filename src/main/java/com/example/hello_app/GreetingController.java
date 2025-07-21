package com.example.hello_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class GreetingController {
    @Autowired
    private GreetingRepository greetingRepository;

    @GetMapping("/greeting")
    public String getGreeting(@RequestParam String langCode) {
        Optional<Greeting> greeting = greetingRepository.findByLangCode(langCode);
        return greeting.map(Greeting::getMessage).orElse("Greeting not found");
    }
}

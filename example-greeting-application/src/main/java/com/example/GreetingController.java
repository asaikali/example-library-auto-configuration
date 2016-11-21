package com.example;

import com.example.greeter.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final Greeter greeter;

    @Autowired
    public GreetingController(Greeter greeter) {
        this.greeter = greeter;
    }

    @GetMapping("/")
    public String hello() {
        return greeter.hello();
    }
}

package com.example.greeter;

public class GreeterBuilder {
    private String message;
    private String name;

    public GreeterBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public GreeterBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public GreeterImpl build() {
        return new GreeterImpl(message, name);
    }
}
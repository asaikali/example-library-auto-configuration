package com.example.greeter;


class GreeterImpl implements Greeter {

    private final String message;
    private final String name;

    GreeterImpl(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String hello() {
        return message + " " + name;
    }
}

package com.example.carlsonapp.controller;

public class OwnException extends RuntimeException{
    private String description;

    public OwnException(String description) {
        this.description = description;
    }
}

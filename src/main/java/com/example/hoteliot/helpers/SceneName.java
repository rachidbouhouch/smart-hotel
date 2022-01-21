package com.example.hoteliot.helpers;

public enum SceneName {
    DASHBOARD("DASHBOARD"),
    CLIENTS("CLIENTS")
    ;

    private final String name;

    private SceneName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
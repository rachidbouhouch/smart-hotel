package com.example.hoteliot.helpers;

public enum ScenePath {

    HOME("/com/example/hoteliot/dashboard.fxml"),
    LOGIN("/com/example/hoteliot/login.fxml"),
    CLIENTS("/com/example/hoteliot/clients.fxml"),
    ;

    private final String path;

    private ScenePath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

package com.example.hoteliot.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class dashboardController {


    @FXML
    void showClientsScreen(ActionEvent event) throws IOException {
        sceneController.getClientsScene(event);
    }

    @FXML
    void refreshWindow(ActionEvent event) throws IOException {
        sceneController.getMainScene(event);
    }
}

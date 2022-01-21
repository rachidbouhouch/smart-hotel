package com.example.hoteliot.Controllers;

import com.example.hoteliot.helpers.ScenePath;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class navbarController {

     @FXML
     private VBox contentArea;

     @FXML
     private Button btnClient;




    public void showClientsScreen(ActionEvent actionEvent) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource(ScenePath.CLIENTS.getPath()));
        contentArea.getChildren().removeAll();
        contentArea.getChildren().setAll(fxml);
        btnClient.setDefaultButton(true);
    }
}

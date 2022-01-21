package com.example.hoteliot.Controllers;

import com.example.hoteliot.Models.Client;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;



public class clientsController {

    @FXML
    private TableView<Client> visitTable;

    @FXML
    private TableColumn<Client, Long> id;

    @FXML
    private TableColumn<Client, String> fullName;

    @FXML
    private TableColumn<Client, String> cin;

    @FXML
    private TableColumn<Client, String> telephone;

    @FXML
    private TableColumn<Client, String> adresse;
}

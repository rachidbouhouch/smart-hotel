package com.example.hoteliot.Controllers;

import com.example.hoteliot.DAO.ClientDAO;
import com.example.hoteliot.Models.Client;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;


public class clientsController {

    @FXML
    private TableView<Client> clientTable;

    @FXML
    private TableColumn<Client, Long> idClient;

    @FXML
    private TableColumn<Client, String> fullName;

    @FXML
    private TableColumn<Client, String> cin;

    @FXML
    private TableColumn<Client, String> telephone;

    @FXML
    private TableColumn<Client, String> adresse;

    @FXML
    private void initialize() {
        System.out.println(clientDAO.getAll());
        setObList();
        fillTable();
    }
    ClientDAO clientDAO = new ClientDAO();
    ObservableList<Client> clientObList = FXCollections.observableArrayList();

    private void fillTable() {
        idClient.setCellValueFactory(new PropertyValueFactory<>("id"));
        fullName.setCellValueFactory(new PropertyValueFactory<>("nom"));
        cin.setCellValueFactory(new PropertyValueFactory<>("cin"));
        telephone.setCellValueFactory(new PropertyValueFactory<>("telephone"));
        adresse.setCellValueFactory(new PropertyValueFactory<>("address"));

        clientTable.setItems(clientObList);
    }
    private void setObList() {
        clientObList.clear();
        clientObList.addAll(clientDAO.getAll());
    }
}

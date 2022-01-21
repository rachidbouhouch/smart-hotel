package com.example.hoteliot.Controllers;

import com.example.hoteliot.DAO.UserDAO;
import com.example.hoteliot.Models.User;
import com.example.hoteliot.helpers.CurrentUser;
import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.util.Duration;

import java.io.IOException;

public class loginController {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label infoLine;

    @FXML
    private Label welcome;

    @FXML
    private Button exitBtn;

    UserDAO userDao = new UserDAO();

    @FXML
    private void initialize() {
    }

    @FXML
    private void loginUser(ActionEvent event) throws IOException, InterruptedException {
        String user = username.getText();
        String pass = password.getText();

        if(!validFields()) {
            infoLine.setText("Username and password can't be empty!");
            return;
        }
        if(!validateLogin()){
            infoLine.setText("User not found!");
            return;
        }
        welcome.setText("Welcome, " + CurrentUser.getCurrentUser().getNom()+" "+ CurrentUser.getCurrentUser().getPrenom()+"!");
        infoLine.setText("Redirecting to main dashboard...");

        RotateTransition delay = new RotateTransition(Duration.seconds(4));
        delay.setOnFinished( event2 -> {
            try {
                sceneController.getMainScene(event);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        delay.play();

    }

    boolean validFields() {
        return !username.getText().isEmpty() && !password.getText().isEmpty();
    }

    private boolean validateLogin() {

        User user = userDao.getConnectedUser(username.getText(), password.getText());
        if (user == null) {
            return false;
        }
        CurrentUser.setCurrentUser(user);
        return true;
    }

}

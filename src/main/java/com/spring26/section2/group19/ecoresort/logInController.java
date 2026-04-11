package com.spring26.section2.group19.ecoresort;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class logInController
{
    @javafx.fxml.FXML
    private PasswordField password;
    @javafx.fxml.FXML
    private TextField userName;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logInButton(ActionEvent actionEvent)throws IOException {
        String username = userName.getText();
        String passwords = password.getText();

        if (username.equals("receptionist") && passwords.equals("1234")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/receptionist.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) userName.getScene().getWindow();
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();

        }

        if (username.equals("booking") && passwords.equals("1234")) {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/booking.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = (Stage) userName.getScene().getWindow();
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();

        }
    }
}
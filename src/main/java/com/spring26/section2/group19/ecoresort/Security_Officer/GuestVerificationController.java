package com.spring26.section2.group19.ecoresort.Security_Officer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GuestVerificationController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField guestInputField;

    @FXML
    private Label nameLabel;

    @FXML
    private Label permissionLabel;

    @FXML
    private Label statusLabel;

    @FXML
    void handleVerify(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert guestInputField != null : "fx:id=\"guestInputField\" was not injected: check your FXML file 'GuestVerification.fxml'.";
        assert nameLabel != null : "fx:id=\"nameLabel\" was not injected: check your FXML file 'GuestVerification.fxml'.";
        assert permissionLabel != null : "fx:id=\"permissionLabel\" was not injected: check your FXML file 'GuestVerification.fxml'.";
        assert statusLabel != null : "fx:id=\"statusLabel\" was not injected: check your FXML file 'GuestVerification.fxml'.";

    }

}

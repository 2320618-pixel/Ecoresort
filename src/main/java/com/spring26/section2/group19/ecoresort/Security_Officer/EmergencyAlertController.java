package com.spring26.section2.group19.ecoresort.Security_Officer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class EmergencyAlertController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableColumn<?, ?> colTime;

    @FXML
    private TableColumn<?, ?> colType;

    @FXML
    private RadioButton fireBtn;

    @FXML
    private RadioButton intrusionBtn;

    @FXML
    private RadioButton medicalBtn;

    @FXML
    private Label statusLabel;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleAlert(ActionEvent event) {

    }

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colStatus != null : "fx:id=\"colStatus\" was not injected: check your FXML file 'EmergencyAlert.fxml'.";
        assert colTime != null : "fx:id=\"colTime\" was not injected: check your FXML file 'EmergencyAlert.fxml'.";
        assert colType != null : "fx:id=\"colType\" was not injected: check your FXML file 'EmergencyAlert.fxml'.";
        assert fireBtn != null : "fx:id=\"fireBtn\" was not injected: check your FXML file 'EmergencyAlert.fxml'.";
        assert intrusionBtn != null : "fx:id=\"intrusionBtn\" was not injected: check your FXML file 'EmergencyAlert.fxml'.";
        assert medicalBtn != null : "fx:id=\"medicalBtn\" was not injected: check your FXML file 'EmergencyAlert.fxml'.";
        assert statusLabel != null : "fx:id=\"statusLabel\" was not injected: check your FXML file 'EmergencyAlert.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'EmergencyAlert.fxml'.";

    }

}

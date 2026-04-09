package com.spring26.section2.group19.ecoresort.Security_Officer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class CCTVMonitoringController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> cameraCombo;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colLocation;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TextArea feedArea;

    @FXML
    private Label statusLabel;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleViewCamera(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert cameraCombo != null : "fx:id=\"cameraCombo\" was not injected: check your FXML file 'CCTVMonitoring.fxml'.";
        assert colId != null : "fx:id=\"colId\" was not injected: check your FXML file 'CCTVMonitoring.fxml'.";
        assert colLocation != null : "fx:id=\"colLocation\" was not injected: check your FXML file 'CCTVMonitoring.fxml'.";
        assert colStatus != null : "fx:id=\"colStatus\" was not injected: check your FXML file 'CCTVMonitoring.fxml'.";
        assert feedArea != null : "fx:id=\"feedArea\" was not injected: check your FXML file 'CCTVMonitoring.fxml'.";
        assert statusLabel != null : "fx:id=\"statusLabel\" was not injected: check your FXML file 'CCTVMonitoring.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'CCTVMonitoring.fxml'.";

    }

}

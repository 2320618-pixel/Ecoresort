package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class SpecialDietaryRequestsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colGuest;

    @FXML
    private TableColumn<?, ?> colRequest;

    @FXML
    private TableColumn<?, ?> colRoom;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleApprove(ActionEvent event) {

    }

    @FXML
    void handleReject(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colGuest != null : "fx:id=\"colGuest\" was not injected: check your FXML file 'SpecialDietaryRequests.fxml'.";
        assert colRequest != null : "fx:id=\"colRequest\" was not injected: check your FXML file 'SpecialDietaryRequests.fxml'.";
        assert colRoom != null : "fx:id=\"colRoom\" was not injected: check your FXML file 'SpecialDietaryRequests.fxml'.";
        assert colStatus != null : "fx:id=\"colStatus\" was not injected: check your FXML file 'SpecialDietaryRequests.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'SpecialDietaryRequests.fxml'.";

    }

}

package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RoomServiceController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colGuest;

    @FXML
    private TableColumn<?, ?> colItem;

    @FXML
    private TableColumn<?, ?> colRoom;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleDeliver(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colGuest != null : "fx:id=\"colGuest\" was not injected: check your FXML file 'RoomService.fxml'.";
        assert colItem != null : "fx:id=\"colItem\" was not injected: check your FXML file 'RoomService.fxml'.";
        assert colRoom != null : "fx:id=\"colRoom\" was not injected: check your FXML file 'RoomService.fxml'.";
        assert colStatus != null : "fx:id=\"colStatus\" was not injected: check your FXML file 'RoomService.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'RoomService.fxml'.";

    }

}

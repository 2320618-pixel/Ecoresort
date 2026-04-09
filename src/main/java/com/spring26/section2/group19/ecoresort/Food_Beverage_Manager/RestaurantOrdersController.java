package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class RestaurantOrdersController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colItem;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private ComboBox<?> statusCombo;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleUpdate(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colId != null : "fx:id=\"colId\" was not injected: check your FXML file 'RestaurantOrders.fxml'.";
        assert colItem != null : "fx:id=\"colItem\" was not injected: check your FXML file 'RestaurantOrders.fxml'.";
        assert colQty != null : "fx:id=\"colQty\" was not injected: check your FXML file 'RestaurantOrders.fxml'.";
        assert colStatus != null : "fx:id=\"colStatus\" was not injected: check your FXML file 'RestaurantOrders.fxml'.";
        assert statusCombo != null : "fx:id=\"statusCombo\" was not injected: check your FXML file 'RestaurantOrders.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'RestaurantOrders.fxml'.";

    }

}

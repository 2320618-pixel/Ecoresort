package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FoodInventoryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TextField qtyField;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleUpdate(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colName != null : "fx:id=\"colName\" was not injected: check your FXML file 'FoodInventory.fxml'.";
        assert colQty != null : "fx:id=\"colQty\" was not injected: check your FXML file 'FoodInventory.fxml'.";
        assert colStatus != null : "fx:id=\"colStatus\" was not injected: check your FXML file 'FoodInventory.fxml'.";
        assert qtyField != null : "fx:id=\"qtyField\" was not injected: check your FXML file 'FoodInventory.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'FoodInventory.fxml'.";

    }

}

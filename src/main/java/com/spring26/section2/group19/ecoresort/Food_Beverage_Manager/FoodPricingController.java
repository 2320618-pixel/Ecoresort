package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FoodPricingController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colItem;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TextField priceField;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleUpdate(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colItem != null : "fx:id=\"colItem\" was not injected: check your FXML file 'FoodPricing.fxml'.";
        assert colPrice != null : "fx:id=\"colPrice\" was not injected: check your FXML file 'FoodPricing.fxml'.";
        assert priceField != null : "fx:id=\"priceField\" was not injected: check your FXML file 'FoodPricing.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'FoodPricing.fxml'.";

    }

}

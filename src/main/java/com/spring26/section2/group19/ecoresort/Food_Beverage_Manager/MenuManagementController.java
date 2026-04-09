package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MenuManagementController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton availableBtn;

    @FXML
    private ComboBox<?> categoryCombo;

    @FXML
    private TableColumn<?, ?> colAvailability;

    @FXML
    private TableColumn<?, ?> colCategory;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPrice;

    @FXML
    private TextField nameField;

    @FXML
    private RadioButton notAvailableBtn;

    @FXML
    private TextField priceField;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleSave(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert availableBtn != null : "fx:id=\"availableBtn\" was not injected: check your FXML file 'MenuManagement.fxml'.";
        assert categoryCombo != null : "fx:id=\"categoryCombo\" was not injected: check your FXML file 'MenuManagement.fxml'.";
        assert colAvailability != null : "fx:id=\"colAvailability\" was not injected: check your FXML file 'MenuManagement.fxml'.";
        assert colCategory != null : "fx:id=\"colCategory\" was not injected: check your FXML file 'MenuManagement.fxml'.";
        assert colName != null : "fx:id=\"colName\" was not injected: check your FXML file 'MenuManagement.fxml'.";
        assert colPrice != null : "fx:id=\"colPrice\" was not injected: check your FXML file 'MenuManagement.fxml'.";
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'MenuManagement.fxml'.";
        assert notAvailableBtn != null : "fx:id=\"notAvailableBtn\" was not injected: check your FXML file 'MenuManagement.fxml'.";
        assert priceField != null : "fx:id=\"priceField\" was not injected: check your FXML file 'MenuManagement.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'MenuManagement.fxml'.";

    }

}

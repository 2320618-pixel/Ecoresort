package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SupplierOrdersController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colItems;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private TableColumn<?, ?> colSupplier;

    @FXML
    private TextArea itemsArea;

    @FXML
    private TextField qtyField;

    @FXML
    private TextField supplierField;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleOrder(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colItems != null : "fx:id=\"colItems\" was not injected: check your FXML file 'SupplierOrders.fxml'.";
        assert colQty != null : "fx:id=\"colQty\" was not injected: check your FXML file 'SupplierOrders.fxml'.";
        assert colStatus != null : "fx:id=\"colStatus\" was not injected: check your FXML file 'SupplierOrders.fxml'.";
        assert colSupplier != null : "fx:id=\"colSupplier\" was not injected: check your FXML file 'SupplierOrders.fxml'.";
        assert itemsArea != null : "fx:id=\"itemsArea\" was not injected: check your FXML file 'SupplierOrders.fxml'.";
        assert qtyField != null : "fx:id=\"qtyField\" was not injected: check your FXML file 'SupplierOrders.fxml'.";
        assert supplierField != null : "fx:id=\"supplierField\" was not injected: check your FXML file 'SupplierOrders.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'SupplierOrders.fxml'.";

    }

}

package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class FoodSalesReportController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colItem;

    @FXML
    private TableColumn<?, ?> colQty;

    @FXML
    private TableColumn<?, ?> colTotal;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextArea summaryArea;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleGenerate(ActionEvent event) {

    }

    @FXML
    void handleSave(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colItem != null : "fx:id=\"colItem\" was not injected: check your FXML file 'FoodSalesReport.fxml'.";
        assert colQty != null : "fx:id=\"colQty\" was not injected: check your FXML file 'FoodSalesReport.fxml'.";
        assert colTotal != null : "fx:id=\"colTotal\" was not injected: check your FXML file 'FoodSalesReport.fxml'.";
        assert datePicker != null : "fx:id=\"datePicker\" was not injected: check your FXML file 'FoodSalesReport.fxml'.";
        assert summaryArea != null : "fx:id=\"summaryArea\" was not injected: check your FXML file 'FoodSalesReport.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'FoodSalesReport.fxml'.";

    }

}

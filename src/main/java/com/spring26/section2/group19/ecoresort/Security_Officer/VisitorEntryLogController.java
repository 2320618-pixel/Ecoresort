package com.spring26.section2.group19.ecoresort.Security_Officer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VisitorEntryLogController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colId;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableColumn<?, ?> colPhone;

    @FXML
    private TableColumn<?, ?> colPurpose;

    @FXML
    private TableColumn<?, ?> colTime;

    @FXML
    private DatePicker entryDate;

    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneField;

    @FXML
    private TextArea purposeArea;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleAddEntry(ActionEvent event) {

    }

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colId != null : "fx:id=\"colId\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";
        assert colName != null : "fx:id=\"colName\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";
        assert colPhone != null : "fx:id=\"colPhone\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";
        assert colPurpose != null : "fx:id=\"colPurpose\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";
        assert colTime != null : "fx:id=\"colTime\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";
        assert entryDate != null : "fx:id=\"entryDate\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";
        assert nameField != null : "fx:id=\"nameField\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";
        assert phoneField != null : "fx:id=\"phoneField\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";
        assert purposeArea != null : "fx:id=\"purposeArea\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'VisitorEntryLog.fxml'.";

    }

}

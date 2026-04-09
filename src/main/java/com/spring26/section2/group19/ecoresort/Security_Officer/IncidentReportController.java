package com.spring26.section2.group19.ecoresort.Security_Officer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class IncidentReportController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colDate;

    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colLocation;

    @FXML
    private TableColumn<?, ?> colType;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private TextField locationField;

    @FXML
    private TableView<?> tableView;

    @FXML
    private ComboBox<?> typeCombo;

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleSubmit(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert colDate != null : "fx:id=\"colDate\" was not injected: check your FXML file 'IncidentReport.fxml'.";
        assert colDescription != null : "fx:id=\"colDescription\" was not injected: check your FXML file 'IncidentReport.fxml'.";
        assert colLocation != null : "fx:id=\"colLocation\" was not injected: check your FXML file 'IncidentReport.fxml'.";
        assert colType != null : "fx:id=\"colType\" was not injected: check your FXML file 'IncidentReport.fxml'.";
        assert datePicker != null : "fx:id=\"datePicker\" was not injected: check your FXML file 'IncidentReport.fxml'.";
        assert descriptionArea != null : "fx:id=\"descriptionArea\" was not injected: check your FXML file 'IncidentReport.fxml'.";
        assert locationField != null : "fx:id=\"locationField\" was not injected: check your FXML file 'IncidentReport.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'IncidentReport.fxml'.";
        assert typeCombo != null : "fx:id=\"typeCombo\" was not injected: check your FXML file 'IncidentReport.fxml'.";

    }

}

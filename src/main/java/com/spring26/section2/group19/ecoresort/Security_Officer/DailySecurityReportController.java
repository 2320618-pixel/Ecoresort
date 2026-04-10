package com.spring26.section2.group19.ecoresort.Security_Officer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class DailySecurityReportController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<?, ?> colEntries;

    @FXML
    private TableColumn<?, ?> colIncidents;

    @FXML
    private TableColumn<?, ?> colPatrols;

    @FXML
    private TableColumn<?, ?> colStatus;

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
        assert colEntries != null : "fx:id=\"colEntries\" was not injected: check your FXML file 'DailySecurityReport.fxml'.";
        assert colIncidents != null : "fx:id=\"colIncidents\" was not injected: check your FXML file 'DailySecurityReport.fxml'.";
        assert colPatrols != null : "fx:id=\"colPatrols\" was not injected: check your FXML file 'DailySecurityReport.fxml'.";
        assert colStatus != null : "fx:id=\"colStatus\" was not injected: check your FXML file 'DailySecurityReport.fxml'.";
        assert datePicker != null : "fx:id=\"datePicker\" was not injected: check your FXML file 'DailySecurityReport.fxml'.";
        assert summaryArea != null : "fx:id=\"summaryArea\" was not injected: check your FXML file 'DailySecurityReport.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'DailySecurityReport.fxml'.";

    }

}

package com.spring26.section2.group19.ecoresort.Security_Officer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PatrolLogController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<?> areaCombo;

    @FXML
    private TableColumn<?, ?> colArea;

    @FXML
    private TableColumn<?, ?> colEnd;

    @FXML
    private TableColumn<?, ?> colStart;

    @FXML
    private TextField endTimeField;

    @FXML
    private TextField startTimeField;

    @FXML
    private TableView<?> tableView;

    @FXML
    void handleAddLog(ActionEvent event) {

    }

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert areaCombo != null : "fx:id=\"areaCombo\" was not injected: check your FXML file 'PatrolLog.fxml'.";
        assert colArea != null : "fx:id=\"colArea\" was not injected: check your FXML file 'PatrolLog.fxml'.";
        assert colEnd != null : "fx:id=\"colEnd\" was not injected: check your FXML file 'PatrolLog.fxml'.";
        assert colStart != null : "fx:id=\"colStart\" was not injected: check your FXML file 'PatrolLog.fxml'.";
        assert endTimeField != null : "fx:id=\"endTimeField\" was not injected: check your FXML file 'PatrolLog.fxml'.";
        assert startTimeField != null : "fx:id=\"startTimeField\" was not injected: check your FXML file 'PatrolLog.fxml'.";
        assert tableView != null : "fx:id=\"tableView\" was not injected: check your FXML file 'PatrolLog.fxml'.";

    }

}

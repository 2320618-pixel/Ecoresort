package com.spring26.section2.group19.ecoresort;

import javafx.event.ActionEvent;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class availableRoomsController
{
    @javafx.fxml.FXML
    private TextField totalGuestField;
    @javafx.fxml.FXML
    private TableColumn typeCol;
    @javafx.fxml.FXML
    private TextField checkOutField;
    @javafx.fxml.FXML
    private TableColumn roomNoCol;
    @javafx.fxml.FXML
    private TextField checkInField;
    @javafx.fxml.FXML
    private TableColumn capacityCol;
    @javafx.fxml.FXML
    private PieChart pirChart;
    @javafx.fxml.FXML
    private TableColumn priceCol;
    @javafx.fxml.FXML
    private PieChart pieChart;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void search(ActionEvent actionEvent) {
    }
}
package com.spring26.section2.group19.ecoresort.Ayesha;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CalculateBillController
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TextArea billDetails;
    @javafx.fxml.FXML
    private ComboBox itemType;
    @javafx.fxml.FXML
    private TextField priceTotal;
    @javafx.fxml.FXML
    private TextField discount;
    @javafx.fxml.FXML
    private TextField showTotalAmount;
    @javafx.fxml.FXML
    private TextField daysTotal;
    @javafx.fxml.FXML
    private TextField bookingID;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateBillBtn(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void calculateTotalBillBtn(ActionEvent actionEvent) {
    }
}
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

    Bill bill;
    @javafx.fxml.FXML
    public void initialize() {
        itemType.getItems().addAll("Room", "Restaurant", "Spa", "Activity");


    }

    @javafx.fxml.FXML
    public void generateBillBtn(ActionEvent actionEvent) {
        String checkOutDate = date.getValue().toString();
        String bookingIDText = bookingID.getText();
        String itemTypeText = itemType.getValue().toString();
        int days = Integer.parseInt(daysTotal.getText());
        double pricePerDay = Double.parseDouble(priceTotal.getText());
        double discountValue = Double.parseDouble(discount.getText());
        double totalAmount = (pricePerDay * days) - discountValue;
        String billDetailsText = billDetails.getText();

        bill = new Bill(checkOutDate, bookingIDText, itemTypeText, days, pricePerDay, discountValue, totalAmount, billDetailsText);
        showTotalAmount.setText(String.valueOf(totalAmount));
    }

    @javafx.fxml.FXML
    public void calculateTotalBillBtn(ActionEvent actionEvent) {
        String checkOutDate = date.getValue().toString();
        String bookingIDText = bookingID.getText();
        String itemTypeText = itemType.getValue().toString();
        int days = Integer.parseInt(daysTotal.getText());
        double pricePerDay = Double.parseDouble(priceTotal.getText());
        double discountValue = Double.parseDouble(discount.getText());
        double totalAmount = (pricePerDay * days) - discountValue;
        String billDetailsText = billDetails.getText();

    }
}
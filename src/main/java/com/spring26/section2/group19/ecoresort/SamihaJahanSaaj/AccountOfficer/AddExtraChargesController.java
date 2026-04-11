package com.spring26.section2.group19.ecoresort.SamihaJahanSaaj.AccountOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class AddExtraChargesController
{
    @javafx.fxml.FXML
    private TableColumn<GuestBilling, String> guestIdColumn;
    @javafx.fxml.FXML
    private TableColumn<GuestBilling, String> guestNameColumn;
    @javafx.fxml.FXML
    private TextField chargeAmountTextField;
    @javafx.fxml.FXML
    private Button addChargeButton;
    @javafx.fxml.FXML
    private TextField updatedBalanceTextField;
    @javafx.fxml.FXML
    private TableView<GuestBilling> guestBillingTable;
    @javafx.fxml.FXML
    private TextField chargeTypeTextField;
    @javafx.fxml.FXML
    private TableColumn<GuestBilling, Double> balanceColumn;
    @javafx.fxml.FXML
    private Label statusLabel;

    private ObservableList<GuestBilling> guestBillingList;

    @javafx.fxml.FXML
    public void initialize() {

        guestIdColumn.setCellValueFactory(new PropertyValueFactory<>("guestId"));
        guestNameColumn.setCellValueFactory(new PropertyValueFactory<>("guestName"));
        balanceColumn.setCellValueFactory(new PropertyValueFactory<>("balance"));

        guestBillingList = FXCollections.observableArrayList();

        guestBillingList.add(new GuestBilling("G101", "Rahim", 5000));
        guestBillingList.add(new GuestBilling("G102", "Karim", 7200));
        guestBillingList.add(new GuestBilling("G103", "Jannat", 8600));
        guestBillingList.add(new GuestBilling("G104", "Sadia", 4300));

        guestBillingTable.setItems(guestBillingList);

        statusLabel.setText("");
        updatedBalanceTextField.setEditable(false);

        guestBillingTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                updatedBalanceTextField.setText(String.valueOf(newValue.getBalance()));
            }
        });
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addChargeButton(ActionEvent actionEvent) {

        GuestBilling selectedGuest = guestBillingTable.getSelectionModel().getSelectedItem();

        if (selectedGuest == null) {
            statusLabel.setText("Select a guest first");
            return;
        }

        String chargeType = chargeTypeTextField.getText();
        String chargeAmount = chargeAmountTextField.getText();

        if (chargeType.isEmpty() || chargeAmount.isEmpty()) {
            statusLabel.setText("Please fill up charge type and amount");
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(chargeAmount);
        } catch (NumberFormatException e) {
            statusLabel.setText("Enter a valid amount");
            return;
        }

        double newBalance = selectedGuest.getBalance() + amount;
        selectedGuest.setBalance(newBalance);

        guestBillingTable.refresh();
        updatedBalanceTextField.setText(String.valueOf(newBalance));
        statusLabel.setText("Extra charge added successfully");

        chargeTypeTextField.clear();
        chargeAmountTextField.clear();
    }
}
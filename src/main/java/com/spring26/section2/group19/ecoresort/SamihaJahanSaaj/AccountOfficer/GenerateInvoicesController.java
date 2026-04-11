package com.spring26.section2.group19.ecoresort.SamihaJahanSaaj.AccountOfficer;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GenerateInvoicesController
{
    @javafx.fxml.FXML
    private TextField roomChargeField;
    @javafx.fxml.FXML
    private Button printBtn;
    @javafx.fxml.FXML
    private Button loadBtn;
    @javafx.fxml.FXML
    private TextField guestNameField;
    @javafx.fxml.FXML
    private TextField taxField;
    @javafx.fxml.FXML
    private TextField totalField;
    @javafx.fxml.FXML
    private TextField serviceChargeField;
    @javafx.fxml.FXML
    private Button downloadBtn;
    @javafx.fxml.FXML
    private Button generateBtn;
    @javafx.fxml.FXML
    private ComboBox bookingComboBox;
    @javafx.fxml.FXML
    private TextArea invoicePreviewArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    public void onActionIdDownloadBtn(ActionEvent actionEvent) {
    }
}
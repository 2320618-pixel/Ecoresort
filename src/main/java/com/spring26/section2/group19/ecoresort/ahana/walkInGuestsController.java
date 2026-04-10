package com.spring26.section2.group19.ecoresort.ahana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class walkInGuestsController
{
    @javafx.fxml.FXML
    private TableColumn typeCol;
    @javafx.fxml.FXML
    private TextField enterDepositAmountField;
    @javafx.fxml.FXML
    private TextField guestNameField;
    @javafx.fxml.FXML
    private TableColumn roomNoCol;
    @javafx.fxml.FXML
    private TableColumn billCol;
    @javafx.fxml.FXML
    private ComboBox selectRoom;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkAvailability(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmBooking(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/receptionist.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) enterDepositAmountField.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
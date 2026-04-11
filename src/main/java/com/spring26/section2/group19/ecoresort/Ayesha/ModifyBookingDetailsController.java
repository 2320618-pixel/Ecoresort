package com.spring26.section2.group19.ecoresort.Ayesha;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ModifyBookingDetailsController
{
    @javafx.fxml.FXML
    private RadioButton activeRBtn;
    @javafx.fxml.FXML
    private DatePicker checkIN;
    @javafx.fxml.FXML
    private TextArea spacialRequest;
    @javafx.fxml.FXML
    private TextField numOfGuest;
    @javafx.fxml.FXML
    private DatePicker checkOut;
    @javafx.fxml.FXML
    private RadioButton cancelledRBtn;
    @javafx.fxml.FXML
    private TextField bookingID;
    @javafx.fxml.FXML
    private ComboBox roomType;
    @javafx.fxml.FXML
    private ToggleGroup radio;

    @javafx.fxml.FXML
    public void initialize() {
        roomType.getItems().addAll("Single", "Double", "Suite");

        bookingID.setCellFactory(new PropertyValueFactory<>("bookingID"));
        roomType.setCellFactory(new PropertyValueFactory<>("roomType"));
        checkIN.setCellFactory(new PropertyValueFactory<>("checkIn"));
        checkOut.setCellFactory(new PropertyValueFactory<>("checkOut"));
        numOfGuest.setCellFactory(new PropertyValueFactory<>("numberOfGuests"));
        spacialRequest.setCellFactory(new PropertyValueFactory<>("specialRequest"));
        activeRBtn.setCellFactory(new PropertyValueFactory<>("status"));
        cancelledRBtn.setCellFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void updateBtn(ActionEvent actionEvent) {
        String bookingIDValue = bookingID.getText();
        String roomTypeValue = (String) roomType.getValue();
        String checkInValue = checkIN.getValue().toString();
        String checkOutValue = checkOut.getValue().toString();
        int numOfGuestsValue = Integer.parseInt(numOfGuest.getText());
        String specialRequestValue = spacialRequest.getText();
        String statusValue = activeRBtn.isSelected() ? "Active" : "Cancelled";

    }

    @javafx.fxml.FXML
    public void saveBtn(ActionEvent actionEvent) {
        String bookingIDValue = bookingID.getText();
        String roomTypeValue = (String) roomType.getValue();
        String checkInValue = checkIN.getValue().toString();
        String checkOutValue = checkOut.getValue().toString();
        int numOfGuestsValue = Integer.parseInt(numOfGuest.getText());
        String specialRequestValue = spacialRequest.getText();
        String statusValue = activeRBtn.isSelected() ? "Active" : "Cancelled";

    }
}
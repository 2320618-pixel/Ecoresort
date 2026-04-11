package com.spring26.section2.group19.ecoresort.Ayesha;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class UpdateOrCancelBookingRequestController
{
    @javafx.fxml.FXML
    private TableColumn dateClm;
    @javafx.fxml.FXML
    private DatePicker updateDate;
    @javafx.fxml.FXML
    private TextField updateGuestNo;
    @javafx.fxml.FXML
    private TextArea updateRequirements;
    @javafx.fxml.FXML
    private TableColumn requirementsClm;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn noOfGuestClm;

    BookingReqUpdate bookingReqUpdate;
    @javafx.fxml.FXML
    public void initialize() {
        dateClm .setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("date"));
        noOfGuestClm.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("numberOfGuests"));
        requirementsClm.setCellValueFactory(new javafx.scene.control.cell.PropertyValueFactory<>("requirements"));

    }

    @javafx.fxml.FXML
    public void saveBtn(ActionEvent actionEvent) {
        String date = updateDate.getValue().toString();
        int numberOfGuests = Integer.parseInt(updateGuestNo.getText());
        String requirements = updateRequirements.getText();
        String status = "Updated";

        BookingReqUpdate bookingReqUpdate = new BookingReqUpdate(date, numberOfGuests, requirements, status);
        System.out.println(bookingReqUpdate);
    }

    @javafx.fxml.FXML
    public void cancelreqBtn(ActionEvent actionEvent) {
        String date = updateDate.getValue().toString();
            int numberOfGuests = Integer.parseInt(updateGuestNo.getText());
            String requirements = updateRequirements.getText();
            String status = "Cancelled";

            BookingReqUpdate bookingReqUpdate = new BookingReqUpdate(date, numberOfGuests, requirements, status);
            System.out.println(bookingReqUpdate);
    }

    @javafx.fxml.FXML
    public void updateReqBtn(ActionEvent actionEvent) {
        String date = updateDate.getValue().toString();
            int numberOfGuests = Integer.parseInt(updateGuestNo.getText());
            String requirements = updateRequirements.getText();
            String status = "Updated";

            BookingReqUpdate bookingReqUpdate = new BookingReqUpdate(date, numberOfGuests, requirements, status);
            System.out.println(bookingReqUpdate);
    }
}
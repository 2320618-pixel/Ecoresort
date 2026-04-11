package com.spring26.section2.group19.ecoresort.Ayesha;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class RequestTransportServiceController
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TextArea noteText;
    @javafx.fxml.FXML
    private TextField bookingText;
    @javafx.fxml.FXML
    private TextField locationText;
    @javafx.fxml.FXML
    private TableColumn timeSlotClm;
    @javafx.fxml.FXML
    private TableColumn statusClm;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private RadioButton boat;
    @javafx.fxml.FXML
    private ToggleGroup radio;
    @javafx.fxml.FXML
    private ComboBox timeSlotText;
    @javafx.fxml.FXML
    private TableColumn pickupLocationClm;
    @javafx.fxml.FXML
    private RadioButton car;
    @javafx.fxml.FXML
    private RadioButton jeep;
    @javafx.fxml.FXML
    private TableColumn transportTypeClm;
    @javafx.fxml.FXML
    private TextField dropOFFlocation;
    @javafx.fxml.FXML
    private TableColumn bookingIDClm;
    @javafx.fxml.FXML
    private TableColumn traveldateClm;
    @javafx.fxml.FXML
    private ComboBox status;

    @javafx.fxml.FXML
    public void initialize() {
        timeSlotText.getItems().addAll("Morning", "Afternoon", "Evening");
        status.getItems().addAll("Pending", "Approved", "Rejected");
        bookingIDClm.setCellValueFactory(new PropertyValueFactory<>("bookingID"));
        transportTypeClm.setCellValueFactory(new PropertyValueFactory<>("transportType"));
        traveldateClm.setCellValueFactory(new PropertyValueFactory<>("travelDate"));
        timeSlotClm.setCellValueFactory(new PropertyValueFactory<>("timeSlot"));
        pickupLocationClm.setCellValueFactory(new PropertyValueFactory<>("pickupLocation"));
        statusClm.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @javafx.fxml.FXML
    public void travelDate(ActionEvent actionEvent) {
        String travelDate = date.getValue().toString();

    }

    @javafx.fxml.FXML
    public void save(ActionEvent actionEvent) {
        String bookingID = bookingText.getText();
        String transportType = "";
        if (car.isSelected()) {
            transportType = "Car";
        } else if (jeep.isSelected()) {
            transportType = "Jeep";
        } else if (boat.isSelected()) {
            transportType = "Boat";
        }
        String travelDate = date.getValue().toString();
        String timeSlot = timeSlotText.getValue().toString();
        String pickupLocation = locationText.getText();
        String dropOffLocation = dropOFFlocation.getText();
        String note = noteText.getText();
        String statusValue = status.getValue().toString();

        TransportRequest request = new TransportRequest(bookingID, transportType, travelDate, timeSlot, pickupLocation, dropOffLocation, note, statusValue);
        tableView.getItems().add(request);
        bookingText.clear();
        locationText.clear();
        dropOFFlocation.clear();
        noteText.clear();
    }

    @javafx.fxml.FXML
    public void tableView(Event event) {
        String bookingID = bookingText.getText();
        String transportType = "";
        if (car.isSelected()) {
            transportType = "Car";
    }

    @javafx.fxml.FXML
    public void sendReqBtn(ActionEvent actionEvent) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Request Sent");
            alert.setHeaderText(null);
            alert.setContentText("Your transport request has been sent successfully!");
            alert.showAndWait();
        }
    }
}
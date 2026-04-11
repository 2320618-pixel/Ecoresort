package com.spring26.section2.group19.ecoresort.Ayesha;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class AssignResortServicesToBookingController
{
    @javafx.fxml.FXML
    private ComboBox serviceType;
    @javafx.fxml.FXML
    private TableColumn serviceTypeClm;
    @javafx.fxml.FXML
    private RadioButton normal;
    @javafx.fxml.FXML
    private TableColumn priorityClm;
    @javafx.fxml.FXML
    private TextField filterPriority;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TextArea noteArea;
    @javafx.fxml.FXML
    private TableColumn noteClm;
    @javafx.fxml.FXML
    private RadioButton urgent;
    @javafx.fxml.FXML
    private TableColumn bookingIDClm;
    @javafx.fxml.FXML
    private TextField bookingID;
    @javafx.fxml.FXML
    private ToggleGroup radio;

    @javafx.fxml.FXML
    public void initialize() {
        serviceType.getItems().addAll("Room", "Restaurant", "Spa", "Activity");

    }

    @javafx.fxml.FXML
    public void filterBtn(ActionEvent actionEvent) {
        String priorityFilter = filterPriority.getText();
        // Implement filtering logic based on the priorityFilter value

    }

    @javafx.fxml.FXML
    public void assignServiceOnAction(ActionEvent actionEvent) {
        String bookingIDText = bookingID.getText();
        String serviceTypeText = serviceType.getValue().toString();
        String noteText = noteArea.getText();
        String priority = normal.isSelected() ? "Normal" : urgent.isSelected() ? "Urgent" : "Not Specified";

        // Implement logic to assign the selected service to the booking with the provided details
    }
}
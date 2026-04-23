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


    }

    @javafx.fxml.FXML
    public void filterBtn(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void assignServiceOnAction(ActionEvent actionEvent) {
    }
}
package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import com.spring26.section2.group19.ecoresort.RecordGuests;
import com.spring26.section2.group19.ecoresort.Routine;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class recordGuestsController
{
    @javafx.fxml.FXML
    private TableColumn<RecordGuests,String> guideMarkAttendanceColumn;
    @javafx.fxml.FXML
    private TableColumn<RecordGuests,String> loadGuestsColumn;
    @javafx.fxml.FXML
    private TableView<RecordGuests> recordTable;
    List<RecordGuests> recordGuestsList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        guideMarkAttendanceColumn.setCellValueFactory(new PropertyValueFactory<>("guideMarkAttendanceColumn"));
        loadGuestsColumn.setCellValueFactory(new PropertyValueFactory<>("loadGuestsColumn"));
        recordGuestsList.add(new RecordGuests("Ahana","Attendance"));

    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void acceptButton(ActionEvent actionEvent) {
        recordTable.getItems().addAll(recordGuestsList);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/MaintenanceStuff.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) recordTable.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }
}
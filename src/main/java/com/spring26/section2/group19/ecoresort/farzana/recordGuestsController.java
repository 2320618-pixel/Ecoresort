package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class recordGuestsController
{
    @javafx.fxml.FXML
    private TableColumn guideMarkAttendanceColumn;
    @javafx.fxml.FXML
    private TableColumn loadGuestsListColumn;
    @javafx.fxml.FXML
    private TableView recordTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void acceptButton(ActionEvent actionEvent) {
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
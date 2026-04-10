package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class maintenanceIssuesFacilitiesController
{
    @javafx.fxml.FXML
    private TableColumn IssueTypeColumn;
    @javafx.fxml.FXML
    private TableColumn savesinputColumn;
    @javafx.fxml.FXML
    private TableColumn stuffLocationColumn;
    @javafx.fxml.FXML
    private TableView maintenanceTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void maintenanceIssuesFacilitiesTabButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void acceptButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/TourGuide.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) maintenanceTable.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
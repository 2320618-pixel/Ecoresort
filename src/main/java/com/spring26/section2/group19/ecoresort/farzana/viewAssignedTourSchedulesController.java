package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class viewAssignedTourSchedulesController
{
    @javafx.fxml.FXML
    private TableColumn scheduleDisplayedColumn;
    @javafx.fxml.FXML
    private TableView TourTable;
    @javafx.fxml.FXML
    private TableColumn tourColumn;
    @javafx.fxml.FXML
    private TableColumn tourScheduleColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/TourGuide.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) TourTable.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewAssignedTourSchedulesTabButton(ActionEvent actionEvent) {
    }
}
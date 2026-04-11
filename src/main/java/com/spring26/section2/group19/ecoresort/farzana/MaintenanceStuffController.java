package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MaintenanceStuffController
{
    @javafx.fxml.FXML
    private Label dashboardLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }





    @javafx.fxml.FXML
    public void updateTourStatusButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/updateTourStatus.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/logInPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



    @javafx.fxml.FXML
    public void maintenanceStuffButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/maintenanceIssuesFacilities.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }










    @javafx.fxml.FXML
    public void performRoutineFacilityButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/performRoutineFacility.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void recordGuestsButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/recordGuests.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void workAsCompletedButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/workAsCompleted.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
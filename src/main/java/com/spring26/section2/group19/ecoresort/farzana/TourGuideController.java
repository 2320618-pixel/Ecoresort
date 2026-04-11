package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class TourGuideController
{
    @javafx.fxml.FXML
    private Label DashboardLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewecoactivityInfoButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/ViewecoactivityInfo.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)  DashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }






    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/logInPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) DashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }





    @javafx.fxml.FXML
    public void ViewAssignedTourSchedulesButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/viewAssignedTourSchedules.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) DashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void maintenanceIssuesFacilitiesButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/maintenanceIssuesFacilities.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) DashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewScheduleButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/viewSchedule.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) DashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void submitActivityFeedbackButton(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/SubmitActivityFeedback.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) DashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
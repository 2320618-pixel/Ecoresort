package com.spring26.section2.group19.ecoresort.Ayesha;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import com.spring26.section2.group19.ecoresort.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TouristDashBoardController
{
    @javafx.fxml.FXML
    private AnchorPane anchorpaneS;
    @javafx.fxml.FXML
    private Label dashboardLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void requestroomBookingBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_TouristFXML/TouristDashBoard/RequestRoomBooking.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void requestSurviceBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_TouristFXML/TouristDashBoard/RequestResortServices.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void cancelBookingBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_TouristFXML/TouristDashBoard/UpdateOrCancelBookingRequest.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void crateTouristProfileBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_TouristFXML/TouristDashBoard/CreateTouristProfile.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void backTouristPgBtn(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/logInPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void transportServiveBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_TouristFXML/TouristDashBoard/RequestTransportService.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void selectedActivitiesBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_TouristFXML/TouristDashBoard/ManageSelectedActivities.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void feedbackBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_TouristFXML/TouristDashBoard/ProvideFeedbackAfterStay.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void modifyBookingBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_TouristFXML/TouristDashBoard/ModifyBookingDetails.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
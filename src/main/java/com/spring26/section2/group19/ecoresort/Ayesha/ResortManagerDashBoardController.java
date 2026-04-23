package com.spring26.section2.group19.ecoresort.Ayesha;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ResortManagerDashBoardController
{
    @javafx.fxml.FXML
    private Label dashboardLabel;
    @javafx.fxml.FXML
    private AnchorPane anchorpane;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void recordMaintanceBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_ResortManagerFXML/RecordMaintenanceIssues.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void calculateBillBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_ResortManagerFXML/CalculateBill.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void generateSummaryBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_ResortManagerFXML/GenerateResortSummaryReport.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void updateBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_ResortManagerFXML/UpdateOrCancelBooking.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void registerTouristInfoBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_ResortManagerFXML/RegisterTouristInformation.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/logInPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void roomInfoBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_ResortManagerFXML/ManageRoomInformation.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void resortServiceBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_ResortManagerFXML/AssignResortServicesToBooking.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void createBookingBtn(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(
                "/com/spring26/section2/group19/Ecoresort/Ayesha_ResortManagerFXML/CreateBookingForTourist.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) dashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
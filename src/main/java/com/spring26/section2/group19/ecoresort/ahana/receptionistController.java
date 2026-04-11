package com.spring26.section2.group19.ecoresort.ahana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class receptionistController
{
    @javafx.fxml.FXML
    private Label userDashboardLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }






    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws  IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/logInPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) userDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    






    @javafx.fxml.FXML
    public void checkGuest(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/checkGuest.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) userDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void checkGuestOut(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/checkGuestOut.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) userDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void addExtraCharge(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/addExtraCharges.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) userDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void walkInGuests(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/walkInGuests.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) userDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



    @javafx.fxml.FXML
    public void emptyOrFull(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/emptyOrFull.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) userDashboardLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class viewguestsdetailsController
{

    @javafx.fxml.FXML
    private TableView tourbookingsTable;
    @javafx.fxml.FXML
    private TableColumn tourbookingsColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void systemretrievesTabButtonta(ActionEvent actionEvent) {
    }

    @Deprecated
    public void rejectButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void acceptButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void backbutton(ActionEvent actionEvent ) throws IOException {

    }

    @javafx.fxml.FXML
    public void mytourscheduleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/TourGuide.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) tourbookingsTable.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
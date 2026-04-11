package com.spring26.section2.group19.ecoresort.ahana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class emptyOrFullController
{
    @javafx.fxml.FXML
    private ComboBox condition;
    @javafx.fxml.FXML
    private TableColumn roomConditionCol;
    @javafx.fxml.FXML
    private TableColumn roomNumberCol;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void roomStatus(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notify(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/receptionist.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) condition.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
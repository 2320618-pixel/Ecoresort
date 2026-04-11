package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class workAsCompletedController
{

    @javafx.fxml.FXML
    private ComboBox<String> selectStuffComboBox;
    @javafx.fxml.FXML
    private TextArea remarksTextArea;
    @javafx.fxml.FXML
    private Label displayLabel;
    @javafx.fxml.FXML
    private PieChart pieChart;

    @javafx.fxml.FXML
    public void initialize() {
        selectStuffComboBox.getItems().addAll("Ahana","Momo");
        pieChart.getData().add(new PieChart.Data("Travelassistance",60));
        pieChart.getData().add(new PieChart.Data("GuideServices",40));
    }

    @Deprecated
    public void rejectButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void acceptButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/MaintenanceStuff.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) selectStuffComboBox.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void markAsCompletedButton(ActionEvent actionEvent) {
        String Remarks = remarksTextArea.getText();

        Work w = new Work(Remarks);

        displayLabel.setText("Completed");

    }
}
package com.spring26.section2.group19.ecoresort.ahana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class mealsOrActivitiesController
{
    @javafx.fxml.FXML
    private TableColumn datesCol;
    @javafx.fxml.FXML
    private ComboBox activity;
    @javafx.fxml.FXML
    private ComboBox service;
    @javafx.fxml.FXML
    private TextField totalField;
    @javafx.fxml.FXML
    private TableColumn roomCol;
    @javafx.fxml.FXML
    private TableColumn currentTotalCol;
    @javafx.fxml.FXML
    private TextField updatedTotalField;
    @javafx.fxml.FXML
    private PieChart pieChart;

    @javafx.fxml.FXML
    public void initialize() {
        pieChart.getData().add(new PieChart.Data("Meals Distribution",30));
        pieChart.getData().add(new PieChart.Data("Activity Breakdown",30));
        pieChart.getData().add(new PieChart.Data("Food Choices",30));
        pieChart.getData().add(new PieChart.Data("Activity Types",10));
    }

    @javafx.fxml.FXML
    public void add(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addservice(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/booking.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) activity.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
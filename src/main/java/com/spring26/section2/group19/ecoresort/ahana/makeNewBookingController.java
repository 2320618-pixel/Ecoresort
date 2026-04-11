package com.spring26.section2.group19.ecoresort.ahana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class makeNewBookingController
{
    @javafx.fxml.FXML
    private TextField totalPriceField;
    @javafx.fxml.FXML
    private TableColumn dateCol;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField emailField;
    @javafx.fxml.FXML
    private TableColumn roomCol;
    @javafx.fxml.FXML
    private TextField phoneField;
    @javafx.fxml.FXML
    private TableColumn priceCol;
    @javafx.fxml.FXML
    private PieChart pieChart;

    @javafx.fxml.FXML
    public void initialize() {
        pieChart.getData().add(new PieChart.Data("New Bookings",30));
        pieChart.getData().add(new PieChart.Data("Booking Summary",30));
        pieChart.getData().add(new PieChart.Data("Recent Bookings",30));
        pieChart.getData().add(new PieChart.Data("Booking Overview",10));

    }

    @javafx.fxml.FXML
    public void confirm(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/booking.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) totalPriceField.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
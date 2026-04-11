package com.spring26.section2.group19.ecoresort.ahana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CancelBookingController
{
    @javafx.fxml.FXML
    private TextField bookingId;
    @javafx.fxml.FXML
    private TextField email;
    @javafx.fxml.FXML
    private TextField policy;
    @javafx.fxml.FXML
    private TextField refund;
    @javafx.fxml.FXML
    private Label displayLabel;
    @javafx.fxml.FXML
    private PieChart pieChart;

    @javafx.fxml.FXML
    public void initialize() {
        pieChart.getData().add(new PieChart.Data("Cancelled Bookings",60));
        pieChart.getData().add(new PieChart.Data("Drop Bookings",40));

    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/booking.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) displayLabel.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void cancel(ActionEvent actionEvent) {
        String book = bookingId.getText();
        String emails = email.getText();
        String policys = policy.getText();
        String refunds = refund.getText();

        cancel c = new cancel( book,emails,policys,refunds);
        displayLabel.setText("booking cancelled");

    }
}
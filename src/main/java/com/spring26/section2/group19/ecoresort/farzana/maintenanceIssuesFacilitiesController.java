package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class maintenanceIssuesFacilitiesController
{
    @javafx.fxml.FXML
    private TableColumn<Maintenance, String> IssueTypeColumn;
    @javafx.fxml.FXML
    private TableColumn<Maintenance, String> savesinputColumn;
    @javafx.fxml.FXML
    private TableColumn<Maintenance, String> stuffLocationColumn;
    @javafx.fxml.FXML
    private TableView<Maintenance> maintenanceTable;
    List<Maintenance> maintenanceList = new ArrayList<>();
    @javafx.fxml.FXML
    private PieChart pieChart;

    @javafx.fxml.FXML
    public void initialize() {
        IssueTypeColumn.setCellValueFactory(new PropertyValueFactory<>("issuesType"));
        savesinputColumn.setCellValueFactory(new PropertyValueFactory<>("savesInput"));
        stuffLocationColumn.setCellValueFactory(new PropertyValueFactory<>("StuffLocation"));

        maintenanceList.add(new Maintenance("Dhaka", "no Ac", "yes"));
        pieChart.getData().add(new PieChart.Data("Repairs",40));
        pieChart.getData().add(new PieChart.Data("Amenities",60));
    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void maintenanceIssuesFacilitiesTabButton(ActionEvent actionEvent) {
        maintenanceTable.getItems().addAll(maintenanceList);
    }

    @javafx.fxml.FXML
    public void acceptButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/TourGuide.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) maintenanceTable.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
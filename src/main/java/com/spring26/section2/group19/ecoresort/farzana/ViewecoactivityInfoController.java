package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ViewecoactivityInfoController
{

    @javafx.fxml.FXML
    private TableColumn<Eco,String> activityColumn;
    @javafx.fxml.FXML
    private TableView<Eco> TourTable;
    List<Eco> ecoList = new ArrayList<>();
    @javafx.fxml.FXML
    private PieChart pieChart;

    @javafx.fxml.FXML
    public void initialize() {
        activityColumn.setCellValueFactory(new PropertyValueFactory<>("Activity"));
        ecoList.add(new Eco("Swimmimg"));
        TourTable.getItems().addAll(ecoList);
        pieChart.getData().add(new PieChart.Data("Swimmimg",20));
        pieChart.getData().add(new PieChart.Data("Tennis",80));
    }

    @Deprecated
    public void rejectButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void acceptButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/TourGuide.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) TourTable.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
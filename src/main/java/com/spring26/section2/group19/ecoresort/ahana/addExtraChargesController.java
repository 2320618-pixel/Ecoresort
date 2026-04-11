package com.spring26.section2.group19.ecoresort.ahana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class addExtraChargesController
{
    @javafx.fxml.FXML
    private ComboBox selectGuest;
    @javafx.fxml.FXML
    private TextField totalField;
    @javafx.fxml.FXML
    private TableColumn<ExtraCharges, Integer>billCol;
    @javafx.fxml.FXML
    private TableColumn<ExtraCharges, String>itemsCol;
    @javafx.fxml.FXML
    private TextField enterRoomField;
    List<ExtraCharges> extraChargesList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableView<ExtraCharges>chargeTable;
    @javafx.fxml.FXML
    private PieChart pirChart;

    @javafx.fxml.FXML
    public void initialize() {
        billCol.setCellValueFactory(new PropertyValueFactory<>("bill"));
        itemsCol.setCellValueFactory(new PropertyValueFactory<>("item"));
        extraChargesList.add(new ExtraCharges("pen", 10));
        pirChart.getData().add(new PieChart.Data("ExtraCharges",30));
        pirChart.getData().add(new PieChart.Data("AddOnCost",70));


    }

    @javafx.fxml.FXML
    public void loadGuest(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addCharge(ActionEvent actionEvent) {
        chargeTable.getItems().addAll(extraChargesList);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/receptionist.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) selectGuest.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
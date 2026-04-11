package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class performRoutineFcilityecoresort
{

    @javafx.fxml.FXML
    private ComboBox<String> selectInspectionAreaComboBox;
    @javafx.fxml.FXML
    private TableColumn<Routine,String > ChecklistColum;
    @javafx.fxml.FXML
    private TableView<Routine> selectInspectionTable;
    List<Routine> routineList = new ArrayList<>();
    @javafx.fxml.FXML
    private PieChart pieChart;

    @javafx.fxml.FXML
    public void initialize() {
        ChecklistColum.setCellValueFactory(new PropertyValueFactory<>("Checklist"));
        routineList.add(new Routine("RoomCleaning"));
        routineList.add(new Routine("TvBill"));


        selectInspectionAreaComboBox.getItems().addAll("room","washroom");
        pieChart.getData().add(new PieChart.Data("RoutineServices",10));
        pieChart.getData().add(new PieChart.Data("FacilityCare",30));
        pieChart.getData().add(new PieChart.Data("RoutineMaintenance",20));
        pieChart.getData().add(new PieChart.Data("DailyMaintenance",40));


    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void performRoutineFacilityTableButton(ActionEvent actionEvent) {
        selectInspectionTable.getItems().addAll(routineList);
    }

    @javafx.fxml.FXML
    public void acceptButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/MaintenanceStuff.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) selectInspectionAreaComboBox.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void loadButton(ActionEvent actionEvent) {
        selectInspectionTable.getItems().addAll(routineList);
    }
}
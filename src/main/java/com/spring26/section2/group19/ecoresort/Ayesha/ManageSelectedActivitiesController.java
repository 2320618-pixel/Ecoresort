package com.spring26.section2.group19.ecoresort.Ayesha;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ManageSelectedActivitiesController
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TableColumn dateClm;
    @javafx.fxml.FXML
    private TableColumn activityClm;
    @javafx.fxml.FXML
    private TableColumn informationClm;
    @javafx.fxml.FXML
    private TextArea touristInfo;
    @javafx.fxml.FXML
    private ComboBox changeActivity;
    @javafx.fxml.FXML
    private TableView tableView;

    SelectedActivity selectedActivity;
    @javafx.fxml.FXML
    public void initialize() {
        changeActivity.getItems().addAll("Hiking", "Bird Watching", "Nature Walks", "Camping", "Fishing", "Photography", "Stargazing", "Wildlife Observation");

        dateClm.setCellValueFactory(new PropertyValueFactory<>("date"));
        activityClm.setCellValueFactory(new PropertyValueFactory<>("activity"));
        informationClm.setCellValueFactory(new PropertyValueFactory<>("information"));
    }

    @javafx.fxml.FXML
    public void updateBtn(ActionEvent actionEvent) {
        String selectedActivity = changeActivity.getValue();
        String information = touristInfo.getText();
        String selectedDate = date.getValue().toString();
    }

    @javafx.fxml.FXML
    public void removeBtn(ActionEvent actionEvent) {
        SelectedActivity selectedActivity = tableView.getSelectionModel().getSelectedItem();
        if (selectedActivity != null) {
            tableView.getItems().remove(selectedActivity);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("No Selection");
            alert.setHeaderText(null);
            alert.setContentText("Please select an activity to remove.");
            alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void saveBtn(ActionEvent actionEvent) {
        String selectedActivity = changeActivity.getValue();
        }
}
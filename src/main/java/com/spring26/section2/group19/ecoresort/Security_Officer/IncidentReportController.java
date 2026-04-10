package com.spring26.section2.group19.ecoresort.Security_Officer;

import com.spring26.section2.group19.ecoresort.Security_Officer.Model.Incident;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class IncidentReportController {

    @FXML private ComboBox<String> typeCombo;
    @FXML private TextArea descArea;

    @FXML private RadioButton lowRB;
    @FXML private RadioButton mediumRB;
    @FXML private RadioButton highRB;

    @FXML private DatePicker datePicker;

    @FXML private TableView<Incident> tableView;
    @FXML private TableColumn<Incident, String> colType;
    @FXML private TableColumn<Incident, String> colDesc;
    @FXML private TableColumn<Incident, String> colSeverity;
    @FXML private TableColumn<Incident, String> colDate;

    private ToggleGroup group = new ToggleGroup();

    // ================= INIT =================
    @FXML
    public void initialize() {

        // Combo
        typeCombo.setItems(FXCollections.observableArrayList(
                "Theft", "Accident", "Fire", "Unauthorized Entry"
        ));

        // Radio group
        lowRB.setToggleGroup(group);
        mediumRB.setToggleGroup(group);
        highRB.setToggleGroup(group);

        // Table binding
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colDesc.setCellValueFactory(new PropertyValueFactory<>("description"));
        colSeverity.setCellValueFactory(new PropertyValueFactory<>("severity"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));

        // Load file silently
        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("incident.bin")
        )) {
            while (true) {
                Incident i = (Incident) stream.readObject();
                tableView.getItems().add(i);
            }
        } catch (EOFException e) {
        } catch (Exception e) {
            System.out.println("No previous data");
        }
    }

    // ================= ADD =================
    @FXML
    public void handleAdd() {

        String type = typeCombo.getValue();
        String desc = descArea.getText();
        LocalDate date = datePicker.getValue();

        if (type == null || desc.isEmpty() || date == null || group.getSelectedToggle() == null) {
            showWarning("Fill all fields!");
            return;
        }

        String severity = ((RadioButton) group.getSelectedToggle()).getText();

        Incident i = new Incident(type, desc, severity, date.toString());
        tableView.getItems().add(i);

        showInfo("Incident reported!");
    }

    // ================= SAVE =================
    @FXML
    public void handleSave() {

        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("incident.bin")
        )) {

            for (Incident i : tableView.getItems()) {
                stream.writeObject(i);
            }

            showInfo("Saved successfully!");

        } catch (IOException e) {
            showError("Save failed!");
        }
    }

    // ================= ALERTS =================
    private void showInfo(String msg) {
        new Alert(Alert.AlertType.INFORMATION, msg).showAndWait();
    }

    private void showWarning(String msg) {
        new Alert(Alert.AlertType.WARNING, msg).showAndWait();
    }

    private void showError(String msg) {
        new Alert(Alert.AlertType.ERROR, msg).showAndWait();
    }
}
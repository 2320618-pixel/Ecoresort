package com.spring26.section2.group19.ecoresort.Security_Officer;

import com.spring26.section2.group19.ecoresort.Security_Officer.Model.VisitorEntry;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;

public class VisitorEntryLogController {

    @FXML private TextField nameField;
    @FXML private TextField idField;
    @FXML private TextField purposeField;
    @FXML private DatePicker datePicker;

    @FXML private TableView<VisitorEntry> tableView;
    @FXML private TableColumn<VisitorEntry, String> colName;
    @FXML private TableColumn<VisitorEntry, String> colId;
    @FXML private TableColumn<VisitorEntry, String> colPurpose;
    @FXML private TableColumn<VisitorEntry, String> colDate;

    // ================= INIT =================
    @FXML
    public void initialize() {

        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colPurpose.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("date"));

        // Load file silently
        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("visitor.bin")
        )) {
            while (true) {
                VisitorEntry v = (VisitorEntry) stream.readObject();
                tableView.getItems().add(v);
            }
        } catch (EOFException e) {
            // normal
        } catch (Exception e) {
            System.out.println("No previous file found.");
        }
    }

    // ================= ADD =================
    @FXML
    public void handleAdd() {

        String name = nameField.getText();
        String id = idField.getText();
        String purpose = purposeField.getText();
        LocalDate date = datePicker.getValue();

        if (name.isEmpty() || id.isEmpty() || purpose.isEmpty() || date == null) {
            showWarning("All fields must be filled!");
            return;
        }

        VisitorEntry v = new VisitorEntry(name, id, purpose, date.toString());
        tableView.getItems().add(v);

        showInfo("Visitor added successfully!");
    }

    // ================= SAVE =================
    @FXML
    public void handleSave() {

        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("visitor.bin")
        )) {

            for (VisitorEntry v : tableView.getItems()) {
                stream.writeObject(v);
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
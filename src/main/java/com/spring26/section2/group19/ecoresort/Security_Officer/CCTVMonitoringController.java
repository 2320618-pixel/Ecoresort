package com.spring26.section2.group19.ecoresort.Security_Officer;

import com.spring26.section2.group19.ecoresort.Security_Officer.Model.CCTV;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class CCTVMonitoringController {

    @FXML private TextField cameraField;
    @FXML private TextField locationField;

    @FXML private RadioButton activeRB;
    @FXML private RadioButton offlineRB;

    @FXML private TableView<CCTV> tableView;
    @FXML private TableColumn<CCTV, String> colId;
    @FXML private TableColumn<CCTV, String> colLocation;
    @FXML private TableColumn<CCTV, String> colStatus;

    private ToggleGroup group = new ToggleGroup();

    // ================= INIT =================
    @FXML
    public void initialize() {

        activeRB.setToggleGroup(group);
        offlineRB.setToggleGroup(group);

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colLocation.setCellValueFactory(new PropertyValueFactory<>("location"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        // 🔥 COLOR STATUS COLUMN
        colStatus.setCellFactory(column -> new TableCell<>() {
            @Override
            protected void updateItem(String status, boolean empty) {
                super.updateItem(status, empty);

                if (empty || status == null) {
                    setText(null);
                    setStyle("");
                } else {
                    setText(status);

                    if (status.equals("Active")) {
                        setStyle("-fx-text-fill: green; -fx-font-weight: bold;");
                    } else {
                        setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
                    }
                }
            }
        });

        // Load file
        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("cctv.bin")
        )) {
            while (true) {
                CCTV c = (CCTV) stream.readObject();
                tableView.getItems().add(c);
            }
        } catch (EOFException e) {
        } catch (Exception e) {
            System.out.println("No previous data");
        }
    }

    // ================= ADD =================
    @FXML
    public void handleAdd() {

        String id = cameraField.getText();
        String location = locationField.getText();

        if (id.isEmpty() || location.isEmpty() || group.getSelectedToggle() == null) {
            showWarning("Fill all fields!");
            return;
        }

        String status = ((RadioButton) group.getSelectedToggle()).getText();

        CCTV c = new CCTV(id, location, status);
        tableView.getItems().add(c);

        showInfo("Camera added!");
    }

    // ================= UPDATE =================
    @FXML
    public void handleUpdate() {

        CCTV selected = tableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showWarning("Select a camera!");
            return;
        }

        if (group.getSelectedToggle() == null) {
            showWarning("Select status!");
            return;
        }

        String newStatus = ((RadioButton) group.getSelectedToggle()).getText();
        selected.setStatus(newStatus);

        tableView.refresh();

        showInfo("Status updated!");
    }

    // ================= SAVE =================
    @FXML
    public void handleSave() {

        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("cctv.bin")
        )) {

            for (CCTV c : tableView.getItems()) {
                stream.writeObject(c);
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
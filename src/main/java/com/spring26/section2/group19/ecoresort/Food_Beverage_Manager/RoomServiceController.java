package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import com.spring26.section2.group19.ecoresort.Food_Beverage_Manager.Model.RoomServiceRequest;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class RoomServiceController {

    @FXML private TextField roomField;
    @FXML private TextField guestField;
    @FXML private TextField itemField;

    @FXML private TableView<RoomServiceRequest> tableView;
    @FXML private TableColumn<RoomServiceRequest, String> colRoom;
    @FXML private TableColumn<RoomServiceRequest, String> colGuest;
    @FXML private TableColumn<RoomServiceRequest, String> colItem;
    @FXML private TableColumn<RoomServiceRequest, String> colStatus;

    // ================= INIT =================
    @FXML
    public void initialize() {

        colRoom.setCellValueFactory(new PropertyValueFactory<>("room"));
        colGuest.setCellValueFactory(new PropertyValueFactory<>("guest"));
        colItem.setCellValueFactory(new PropertyValueFactory<>("item"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        // Load file
        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("roomservice.bin")
        )) {
            while (true) {
                RoomServiceRequest r = (RoomServiceRequest) stream.readObject();
                tableView.getItems().add(r);
            }
        } catch (EOFException e) {
            //
        } catch (Exception e) {
                // No previous data
        }
    }

    // ================= ADD =================
    @FXML
    public void handleAdd() {

        String room = roomField.getText();
        String guest = guestField.getText();
        String item = itemField.getText();

        if (room.isEmpty() || guest.isEmpty() || item.isEmpty()) {
            showWarning("All fields must be filled!");
            return;
        }

        RoomServiceRequest r = new RoomServiceRequest(room, guest, item, "Pending");
        tableView.getItems().add(r);

        showInfo("Request added successfully!");
    }

    // ================= DELIVER =================
    @FXML
    public void handleDeliver() {

        RoomServiceRequest selected = tableView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showWarning("Select a request!");
            return;
        }

        if (selected.getStatus().equals("Delivered")) {
            showWarning("Already delivered!");
            return;
        }

        selected.setStatus("Delivered");
        tableView.refresh();

        showInfo("Marked as delivered!");
    }

    // ================= SAVE =================
    @FXML
    public void handleSave() {

        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("roomservice.bin")
        )) {

            for (RoomServiceRequest r : tableView.getItems()) {
                stream.writeObject(r);
            }

            showInfo("Saved successfully!");

        } catch (IOException e) {
            showError();
        }
    }

    // ================= ALERTS =================
    private void showInfo(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    private void showWarning(String msg) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setContentText(msg);
        alert.showAndWait();
    }

    private void showError() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText("Save failed!");
        alert.showAndWait();
    }
}
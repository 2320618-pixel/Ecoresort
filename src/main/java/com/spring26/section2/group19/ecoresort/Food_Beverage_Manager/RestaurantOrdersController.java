package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import com.spring26.section2.group19.ecoresort.Food_Beverage_Manager.Model.RestaurantOrder;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class RestaurantOrdersController {

    @FXML private TextField idField;
    @FXML private TextField itemField;
    @FXML private TextField qtyField;

    @FXML private ComboBox<String> statusCombo;

    @FXML private TableView<RestaurantOrder> tableView;
    @FXML private TableColumn<RestaurantOrder, String> colId;
    @FXML private TableColumn<RestaurantOrder, String> colItem;
    @FXML private TableColumn<RestaurantOrder, Integer> colQty;
    @FXML private TableColumn<RestaurantOrder, String> colStatus;

    @FXML private Label msgLabel;

    // ================= INITIALIZE =================
    @FXML
    public void initialize() {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colItem.setCellValueFactory(new PropertyValueFactory<>("item"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        statusCombo.setItems(FXCollections.observableArrayList(
                "Pending", "Preparing", "Served"
        ));

        // Load file
        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("order.bin")
        )) {
            while (true) {
                RestaurantOrder o = (RestaurantOrder) stream.readObject();
                tableView.getItems().add(o);
            }
        } catch (EOFException e) {
            msgLabel.setText("Data loaded!");
        } catch (Exception e) {
            msgLabel.setText("No previous data!");
        }
    }

    // ================= ADD =================
    @FXML
    public void handleAdd() {

        try {
            String id = idField.getText();
            String item = itemField.getText();
            int qty = Integer.parseInt(qtyField.getText());

            if (id.isEmpty() || item.isEmpty()) {
                msgLabel.setText("Fill all fields!");
                return;
            }

            if (qty <= 0) {
                msgLabel.setText("Quantity must be positive!");
                return;
            }

            RestaurantOrder order = new RestaurantOrder(id, item, qty, "Pending");
            tableView.getItems().add(order);

            msgLabel.setText("Order added!");

        } catch (NumberFormatException e) {
            msgLabel.setText("Invalid quantity!");
        }
    }

    // ================= UPDATE =================
    @FXML
    public void handleUpdate() {

        RestaurantOrder selected = tableView.getSelectionModel().getSelectedItem();
        String newStatus = statusCombo.getValue();

        if (selected == null) {
            msgLabel.setText("Select an order!");
            return;
        }

        if (newStatus == null) {
            msgLabel.setText("Select status!");
            return;
        }

        selected.setStatus(newStatus);
        tableView.refresh();

        msgLabel.setText("Status updated!");
    }

    // ================= SAVE =================
    @FXML
    public void handleSaveFile() {

        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("order.bin")
        )) {

            for (RestaurantOrder o : tableView.getItems()) {
                stream.writeObject(o);
            }

            msgLabel.setText("Saved successfully!");

        } catch (IOException e) {
            msgLabel.setText("Save failed!");
        }
    }
}
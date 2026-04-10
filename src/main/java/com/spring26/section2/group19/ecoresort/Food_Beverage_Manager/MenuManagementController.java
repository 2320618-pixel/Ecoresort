package com.spring26.section2.group19.ecoresort.Food_Beverage_Manager;

import com.spring26.section2.group19.ecoresort.Food_Beverage_Manager.Model.MenuItem;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;

public class MenuManagementController {

    @FXML private TextField nameField;
    @FXML private ComboBox<String> categoryCombo;
    @FXML private TextField priceField;

    @FXML private RadioButton availableBtn;
    @FXML private RadioButton notAvailableBtn;

    @FXML private TableView<MenuItem> tableView;
    @FXML private TableColumn<MenuItem, String> colName;
    @FXML private TableColumn<MenuItem, String> colCategory;
    @FXML private TableColumn<MenuItem, Double> colPrice;
    @FXML private TableColumn<MenuItem, String> colAvailability;

    @FXML private Label msgLabel;

    private ToggleGroup group = new ToggleGroup();

    // ================= INITIALIZE =================
    @FXML
    public void initialize() {

        // Table binding
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colCategory.setCellValueFactory(new PropertyValueFactory<>("category"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colAvailability.setCellValueFactory(new PropertyValueFactory<>("availability"));

        // ComboBox
        categoryCombo.getItems().addAll("Breakfast", "Lunch", "Dinner", "Drinks");

        // Radio buttons
        availableBtn.setToggleGroup(group);
        notAvailableBtn.setToggleGroup(group);

        // Load file (SAME AS YOUR OLD CODE)
        try (ObjectInputStream stream = new ObjectInputStream(
                new FileInputStream("menu.bin")
        )) {
            while (true) {
                MenuItem m = (MenuItem) stream.readObject();
                tableView.getItems().add(m);
            }
        } catch (EOFException e) {
            msgLabel.setText("Data loaded successfully!");
        } catch (IOException e) {
            msgLabel.setText("No previous data found!");
        } catch (ClassNotFoundException e) {
            msgLabel.setText("Invalid file data!");
        }
    }

    // ================= ADD =================
    @FXML
    public void handleSave(ActionEvent event) {

        try {
            String name = nameField.getText();
            String category = categoryCombo.getValue();
            String priceText = priceField.getText();

            if (name.isEmpty() || category == null || priceText.isEmpty()) {
                msgLabel.setText("Fill all fields!");
                return;
            }

            double price = Double.parseDouble(priceText);

            if (price < 0) {
                msgLabel.setText("Price cannot be negative!");
                return;
            }

            if (group.getSelectedToggle() == null) {
                msgLabel.setText("Select availability!");
                return;
            }

            String availability = ((RadioButton) group.getSelectedToggle()).getText();

            // Update logic (remove duplicate)
            for (MenuItem m : tableView.getItems()) {
                if (m.getName().equalsIgnoreCase(name)) {
                    tableView.getItems().remove(m);
                    break;
                }
            }

            MenuItem item = new MenuItem(name, category, price, availability);
            tableView.getItems().add(item);

            msgLabel.setText("Item added successfully!");

        } catch (NumberFormatException e) {
            msgLabel.setText("Invalid price!");
        }
    }

    // ================= SAVE FILE =================
    @FXML
    public void save(ActionEvent event) {

        try (ObjectOutputStream stream = new ObjectOutputStream(
                new FileOutputStream("menu.bin")
        )) {

            // EXACT SAME AS YOUR OLD WORKING CODE
            for (MenuItem m : tableView.getItems()) {
                stream.writeObject(m);
            }

            msgLabel.setText("Data saved successfully!");

        } catch (IOException e) {
            msgLabel.setText("Error saving file!");
        }
    }

    // ================= CLEAR =================
    @FXML
    public void handleClear(ActionEvent event) {

        nameField.clear();
        priceField.clear();
        categoryCombo.setValue(null);
        group.selectToggle(null);

        msgLabel.setText("Cleared!");
    }
}
package com.spring26.section2.group19.ecoresort.SamihaJahanSaaj.ResortManagement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ManageRoomPricingController
{
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TableColumn<RoomPricing, String> roomTypeColumn;
    @javafx.fxml.FXML
    private Button updatePriceButton;
    @javafx.fxml.FXML
    private TableView<RoomPricing> roomPricingTable;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private TableColumn<RoomPricing, Double> priceColumn;
    @javafx.fxml.FXML
    private TextField roomTypeTextField;

    private ObservableList<RoomPricing> roomPricingList;

    @javafx.fxml.FXML
    public void initialize() {

        roomTypeColumn.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        roomPricingList = FXCollections.observableArrayList();

        roomPricingList.add(new RoomPricing("Standard Room", 5000));
        roomPricingList.add(new RoomPricing("Deluxe Room", 8000));
        roomPricingList.add(new RoomPricing("Suite", 12000));
        roomPricingList.add(new RoomPricing("Family Room", 9500));

        roomPricingTable.setItems(roomPricingList);

        statusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void updatePriceButton(ActionEvent actionEvent) {

        String roomType = roomTypeTextField.getText();
        String priceText = priceTextField.getText();

        if(roomType.isEmpty() || priceText.isEmpty()) {
            statusLabel.setText("Please fill up both fields");
            return;
        }

        double newPrice;
        try {
            newPrice = Double.parseDouble(priceText);
        } catch (NumberFormatException e) {
            statusLabel.setText("Enter a valid price");
            return;
        }

        boolean found = false;

        for(RoomPricing room : roomPricingList) {
            if(room.getRoomType().equalsIgnoreCase(roomType)) {
                room.setPrice(newPrice);
                found = true;
                break;
            }
        }

        roomPricingTable.refresh();

        if(found) {
            statusLabel.setText("Price updated successfully");
        }
        else {
            statusLabel.setText("Room type not found");
        }

        roomTypeTextField.clear();
        priceTextField.clear();
    }
}
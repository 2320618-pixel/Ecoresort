package com.spring26.section2.group19.ecoresort.ahana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class checkGuestOutController
{
    @javafx.fxml.FXML
    private TableView<checkOut> billTable;
    @javafx.fxml.FXML
    private TextField guestroomField;
    @javafx.fxml.FXML
    private TableColumn<checkOut,Integer> totalCol;
    @javafx.fxml.FXML
    private TableColumn<checkOut,String> chargesCol;
    @javafx.fxml.FXML
    private TableColumn<checkOut,String> itemCol;
    @javafx.fxml.FXML
    private ComboBox<String> paymentmethodCB;
    @javafx.fxml.FXML
    private TextField amountField;
    List<checkOut> checkOutList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        chargesCol.setCellValueFactory(new PropertyValueFactory<>("charges"));
        itemCol.setCellValueFactory(new PropertyValueFactory<>("item"));
        totalCol.setCellValueFactory(new PropertyValueFactory<>("total"));
        checkOutList.add(new checkOut("credit card ","pen",500));

    }

    @javafx.fxml.FXML
    public void pay(ActionEvent actionEvent) {

         billTable.getItems().addAll(checkOutList);
    }

    @javafx.fxml.FXML
    public void checkout(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void backbutton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/receptionist.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) billTable.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
package com.spring26.section2.group19.ecoresort.ahana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class checkGuestController
{
    @javafx.fxml.FXML
    private TableView<checkG>guestTable;
    @javafx.fxml.FXML
    private TableColumn<checkG,Integer> guestDetailsCol;
    @javafx.fxml.FXML
    private TableColumn<checkG,Integer> roomNumberCol;
    @javafx.fxml.FXML
    private TextField bookingIdeField;
    List<checkG> checkGList= new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        guestDetailsCol.setCellValueFactory(new PropertyValueFactory<>("guestDetailCol"));
        roomNumberCol.setCellValueFactory(new PropertyValueFactory<>("roomNumberCol"));
        checkGList.add (new checkG("hi", 1));
    }

    @javafx.fxml.FXML
    public void searchButton(ActionEvent actionEvent) {

        guestTable.getItems().addAll(checkGList);
    }

    @javafx.fxml.FXML
    public void markRoomButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmedButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/receptionist.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) guestTable.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
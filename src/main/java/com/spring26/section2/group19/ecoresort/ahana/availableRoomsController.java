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

public class availableRoomsController
{
    @javafx.fxml.FXML
    private TextField totalGuestField;
    @javafx.fxml.FXML
    private TableColumn<rooms,String> typeCol;
    @javafx.fxml.FXML
    private TextField checkOutField;
    @javafx.fxml.FXML
    private TableColumn<rooms,String> roomNoCol;
    @javafx.fxml.FXML
    private TextField checkInField;
    List<rooms> roomsList = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<rooms,Integer> capacityCol;
    @javafx.fxml.FXML
    private TableColumn<rooms,Integer> priceCol;
    @javafx.fxml.FXML
    private TableView<rooms> detailsCol;


    @javafx.fxml.FXML
    public void initialize() {
    roomNoCol.setCellValueFactory(new PropertyValueFactory<>("rooms"));
    typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
    capacityCol.setCellValueFactory(new PropertyValueFactory<>("capacity"));
    priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
    roomsList.add(new rooms("101" ,"standard" , 500,3000 ));



    }

    @javafx.fxml.FXML
    public void search(ActionEvent actionEvent) {
        detailsCol.getItems().addAll(roomsList);
    }


    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/ahana/booking.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) totalGuestField.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

}
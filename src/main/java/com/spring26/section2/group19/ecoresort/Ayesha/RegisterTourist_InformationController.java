package com.spring26.section2.group19.ecoresort.Ayesha;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.io.*;
import java.time.LocalDate;

public class RegisterTourist_InformationController
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private AnchorPane anchorpane;
    @javafx.fxml.FXML
    private TableColumn<Tourist, String> phoneClm;
    @javafx.fxml.FXML
    private TextArea addressTF;
    @javafx.fxml.FXML
    private TableView <Tourist>touristTable;
    @javafx.fxml.FXML
    private TextField filterNameField;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField nidField;
    @javafx.fxml.FXML
    private TextField phoneField;
    @javafx.fxml.FXML
    private TableColumn <Tourist, String>nidClm;
    @javafx.fxml.FXML
    private TableColumn<Tourist, LocalDate> dateClm;
    @javafx.fxml.FXML
    private ComboBox <String>genderCB;
    @javafx.fxml.FXML
    private TableColumn <Tourist, String>genderClm;
    @javafx.fxml.FXML
    private TableColumn<Tourist, String> nameClm;
    @javafx.fxml.FXML
    private TableColumn <Tourist, String>addressClm;

    @javafx.fxml.FXML
    public void initialize() {

        genderCB.getItems().addAll("Male","Female");

        nameClm.setCellValueFactory(new PropertyValueFactory<>("name"));
        nidClm.setCellValueFactory(new PropertyValueFactory<>("nid"));
        phoneClm.setCellValueFactory(new PropertyValueFactory<>("phone"));
        addressClm.setCellValueFactory(new PropertyValueFactory<>("address"));
        dateClm.setCellValueFactory(new PropertyValueFactory<>("date"));
        genderClm.setCellValueFactory(new PropertyValueFactory<>("gender"));
    }

    @javafx.fxml.FXML
    public void loadTouristBtn(ActionEvent actionEvent) {

        touristTable.getItems().clear();

        try {
            FileInputStream fis = new FileInputStream("Tourist.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (true) {
                try {
                    Tourist t = (Tourist) ois.readObject();
                    if (t.getName().equals(filterNameField.getText())){
                        touristTable.getItems().add(t);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        }
        catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void backBtn(ActionEvent actionEvent) throws IOException {

        Node node = FXMLLoader.load(getClass().getResource("ResortManagerDashBoard.fxml"));
        anchorpane.getChildren().setAll(node);


    }

    @javafx.fxml.FXML
    public void saveBtn(ActionEvent actionEvent) {

        try {
            File f = new File("Tourist.bin");

            Tourist t = new Tourist(
                    nameField.getText(),
                    phoneField.getText(),
                    nidField.getText(),
                    genderCB.getValue(),
                    date.getValue(),
                    addressTF.getText()
            );

            if (f.exists()) {
                FileOutputStream fos = new FileOutputStream(f, true);
                ObjectOutputStream oos = new AppendableObjectOutputStream(fos);
                oos.writeObject(t);
                oos.close();
            } else {
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(t);
                oos.close();
            }


            nameField.clear();
            phoneField.clear();
            nidField.clear();
            addressTF.clear();
            genderCB.setValue(null);
            date.setValue(null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
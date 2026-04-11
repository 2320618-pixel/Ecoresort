package com.spring26.section2.group19.ecoresort.Ayesha;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CreateTouristProfileController
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TextField phonetext;
    @javafx.fxml.FXML
    private TextArea preferancesTxtArea;
    @javafx.fxml.FXML
    private TextField nametext;
    @javafx.fxml.FXML
    private TextField emailText;
    @javafx.fxml.FXML
    private ToggleGroup radio;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void saveBtn(ActionEvent actionEvent) {
        String name = nametext.getText();
        String phone = phonetext.getText();
        String email = emailText.getText();
        String gender = ((javafx.scene.control.RadioButton) radio.getSelectedToggle()).getText();
        String dateOfBirth = date.getValue().toString();
        String preferences = preferancesTxtArea.getText();
    }
}
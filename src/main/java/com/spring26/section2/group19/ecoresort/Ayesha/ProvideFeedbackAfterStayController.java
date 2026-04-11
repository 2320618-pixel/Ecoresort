package com.spring26.section2.group19.ecoresort.Ayesha;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProvideFeedbackAfterStayController
{
    @javafx.fxml.FXML
    private TextArea feedback;
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private ComboBox rating;
    @javafx.fxml.FXML
    private TextField bookingID;

    @javafx.fxml.FXML
    public void initialize() {
        rating.getItems().addAll("1", "2", "3", "4", "5");

    }

    @javafx.fxml.FXML
    public void submitBtn(ActionEvent actionEvent) {
        	String bookingIDText = bookingID.getText();
            String feedbackText = feedback.getText();
            String ratingValue = (String) rating.getValue();
            String dateValue = date.getValue().toString();

            Feedback feedbackObj = new Feedback(bookingIDText, Integer.parseInt(ratingValue), feedbackText, dateValue);


    }
}
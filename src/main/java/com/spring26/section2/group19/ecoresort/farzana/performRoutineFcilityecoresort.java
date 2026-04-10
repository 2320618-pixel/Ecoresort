package com.spring26.section2.group19.ecoresort.farzana;

import com.spring26.section2.group19.ecoresort.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;

public class performRoutineFcilityecoresort
{

    @javafx.fxml.FXML
    private ComboBox selectInspectionAreaComboBox;
    @javafx.fxml.FXML
    private TableColumn ChecklistColum;
    @javafx.fxml.FXML
    private TableView selectInspectionTable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void performRoutineFacilityTableButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void acceptButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent)throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/spring26/section2/group19/Ecoresort/farzana/MaintenanceStuff.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) selectInspectionAreaComboBox.getScene().getWindow();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void loadButton(ActionEvent actionEvent) {
    }
}
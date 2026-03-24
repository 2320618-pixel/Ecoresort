module com.spring26.section2.group19.ecoresort {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spring26.section2.group19.ecoresort to javafx.fxml;
    exports com.spring26.section2.group19.ecoresort;
}
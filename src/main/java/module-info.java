module com.spring26.section2.group19.ecoresort {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens com.spring26.section2.group19.ecoresort to javafx.fxml;
    exports com.spring26.section2.group19.ecoresort;
    exports com.spring26.section2.group19.ecoresort.ahana;
    opens com.spring26.section2.group19.ecoresort.ahana to javafx.fxml;
    exports com.spring26.section2.group19.ecoresort.farzana;
    opens com.spring26.section2.group19.ecoresort.farzana to javafx.fxml;
}
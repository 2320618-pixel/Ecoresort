module com.spring26.section2.group19.ecoresort {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.spring26.section2.group19.ecoresort to javafx.fxml;
    opens com.spring26.section2.group19.ecoresort.Security_Officer to javafx.fxml;
//    opens com.spring26.section2.group19.ecoresort.Food_Beverage_Manager to javafx.fxml;
    exports com.spring26.section2.group19.ecoresort;
    exports com.spring26.section2.group19.ecoresort.ahana;
    opens com.spring26.section2.group19.ecoresort.ahana to javafx.fxml;
    exports com.spring26.section2.group19.ecoresort.farzana;
    opens com.spring26.section2.group19.ecoresort.farzana to javafx.fxml;
}
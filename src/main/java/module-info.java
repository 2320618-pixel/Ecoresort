module com.spring26.section2.group19.ecoresort {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;




    opens com.spring26.section2.group19.ecoresort to javafx.fxml;
    opens com.spring26.section2.group19.ecoresort.Security_Officer to javafx.fxml;
    exports com.spring26.section2.group19.ecoresort;
    exports com.spring26.section2.group19.ecoresort.ahana;
    opens com.spring26.section2.group19.ecoresort.ahana to javafx.fxml;
    exports com.spring26.section2.group19.ecoresort.farzana;
    opens com.spring26.section2.group19.ecoresort.farzana to javafx.fxml;
    opens com.spring26.section2.group19.ecoresort.Food_Beverage_Manager to javafx.fxml;
    opens com.spring26.section2.group19.ecoresort.Food_Beverage_Manager.Model to javafx.base, javafx.fxml;
    opens com.spring26.section2.group19.ecoresort.Security_Officer.Model to javafx.base, javafx.fxml;

    opens com.spring26.section2.group19.ecoresort.SamihaJahanSaaj.AccountOfficer to javafx.fxml;
    opens com.spring26.section2.group19.ecoresort.SamihaJahanSaaj.ResortManagement to javafx.fxml;

    exports com.spring26.section2.group19.ecoresort.SamihaJahanSaaj.AccountOfficer;
    exports com.spring26.section2.group19.ecoresort.SamihaJahanSaaj.ResortManagement;
}
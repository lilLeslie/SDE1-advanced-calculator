module dk.sea.advancedcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.sea.advancedcalculator to javafx.fxml;
    exports dk.sea.advancedcalculator;
}
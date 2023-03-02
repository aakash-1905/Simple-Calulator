module calc.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens calc.calculator to javafx.fxml;
    exports calc.calculator;
}
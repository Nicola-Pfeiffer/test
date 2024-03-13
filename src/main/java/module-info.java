module ch.nicola.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens ch.nicola.test to javafx.fxml;
    exports ch.nicola.test;
}
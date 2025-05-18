module be.odisee.jazzclub {
    requires javafx.controls;
    requires javafx.fxml;


    opens be.odisee.jazzclub to javafx.fxml;
    exports be.odisee.jazzclub;
}
module com.example.demozoveelkeerin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demozoveelkeerin to javafx.fxml;
    exports com.example.demozoveelkeerin;
}
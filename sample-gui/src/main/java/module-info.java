module com.example.samplegui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.samplegui to javafx.fxml;
    exports com.example.samplegui;
}
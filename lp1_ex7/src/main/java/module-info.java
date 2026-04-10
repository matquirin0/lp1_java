module org.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.controller to javafx.fxml;

    opens org.example.model to javafx.base;

    opens org.example.view to javafx.fxml;

    exports org.example;
}
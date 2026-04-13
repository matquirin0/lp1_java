module org.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.model.Cabeleireiro to javafx.base;
    opens org.example.model.Farmacia to javafx.base;
    opens org.example.model.Feira to javafx.base;

    opens org.example.controller to javafx.fxml;
    opens org.example to javafx.fxml;

    exports org.example;
}
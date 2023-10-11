module com.example.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.colorchooser to javafx.fxml;
    exports com.example.colorchooser;
}
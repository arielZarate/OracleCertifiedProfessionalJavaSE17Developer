module com.arielzarate.gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.arielzarate.gui to javafx.fxml;
    exports com.arielzarate.gui;
}
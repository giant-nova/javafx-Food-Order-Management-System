module org.vervebridge.proj.foodordermgmtsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;

    opens org.javafxproject.foodordermgmtsystem to javafx.fxml;
    exports org.javafxproject.foodordermgmtsystem;
}
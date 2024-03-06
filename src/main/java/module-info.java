module pt.joanamassas.crossworder {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires java.desktop;

    opens pt.joanamassas.crossworder to javafx.fxml;
    exports pt.joanamassas.crossworder;
    exports pt.joanamassas.crossworder.Controllers;
    opens pt.joanamassas.crossworder.Controllers to javafx.fxml;
    exports pt.joanamassas.crossworder.Controllers.FXMLControllers;
    opens pt.joanamassas.crossworder.Controllers.FXMLControllers to javafx.fxml;
}
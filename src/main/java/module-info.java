module com.assami.javafxlearn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.assami.javafxlearn to javafx.fxml;
    exports com.assami.javafxlearn;
}
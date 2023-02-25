module com.mycompany.countriesflag {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.countriesflag to javafx.fxml;
    exports com.mycompany.countriesflag;
}

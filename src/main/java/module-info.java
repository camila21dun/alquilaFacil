module alquilafacil.alquila_facil1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires lombok;



    exports alquilafacil.alquila_facil1.controller;
    opens alquilafacil.alquila_facil1.controller to javafx.fxml;

    exports alquilafacil.alquila_facil1.application;
    opens alquilafacil.alquila_facil1.application to javafx.fxml;

    exports alquilafacil.alquila_facil1.model;
    opens alquilafacil.alquila_facil1.model to javafx.base;

}
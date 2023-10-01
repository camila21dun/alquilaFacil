package alquilafacil.alquila_facil1.controller;

import java.net.URL;
import java.util.ResourceBundle;


import alquilafacil.alquila_facil1.application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class RegistroVehiculosController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRegistrarVehiculo;

    @FXML
    private Button btnVolver;

    @FXML
    private ComboBox<?> cbTipoCaja;

    @FXML
    private TextField txtKilometraje;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtPlaca;

    @FXML
    private TextField txtPrecio;

    @FXML
    private TextField txtPuertas;

    @FXML
    private TextField txtReferencia;

    @FXML
    private TextField txtUrlFoto;
    private Main main;

    @FXML
    void registrarVehiculoEvent(ActionEvent event) {

    }

    @FXML
    void volverEvent(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }

    public void setApplication(Main main) {
        this.main=main;
    }
}

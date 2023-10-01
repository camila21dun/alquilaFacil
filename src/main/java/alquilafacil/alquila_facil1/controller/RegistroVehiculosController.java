package alquilafacil.alquila_facil1.controller;

import java.net.URL;
import java.util.ResourceBundle;


import alquilafacil.alquila_facil1.application.Main;
import alquilafacil.alquila_facil1.exception.AlquilaException;
import alquilafacil.alquila_facil1.model.AlquilaFacil;

import alquilafacil.alquila_facil1.model.Vehiculo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
    private ComboBox<String> cbTipoCaja;

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
    private final AlquilaFacil alquilaFacil = AlquilaFacil.getInstance();


    @FXML
    void registrarVehiculoEvent(ActionEvent event) {
        registrarVehiculoAction();

    }

    private void registrarVehiculoAction() {

        try {
            alquilaFacil.registrarVehiculo(
                    txtPlaca.getText(),
                    txtReferencia.getText(),
                    txtMarca.getText(),
                    Integer.parseInt(txtModelo.getText()),
                    txtUrlFoto.getText(),
                    Integer.parseInt(txtKilometraje.getText()),
                    Float.parseFloat(txtPrecio.getText()),
                    cbTipoCaja.getValue().equals("Automatica"),
                    Integer.parseInt(txtPuertas.getText())
            );

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("El vehículo se ha registrado correctamente");
            alert.setHeaderText(null);
            alert.show();

        } catch (AlquilaException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.setHeaderText(null);
            alert.show();

        } catch (NumberFormatException e1){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Tenga en cuenta que el número de puertas, modelo, precio por día y kilometraje deben ser números enteros");
            alert.setHeaderText(null);
            alert.show();
        }


    }

    @FXML
    void volverEvent(ActionEvent event) {
        this.main.mostrarInicio();

    }

    @FXML
    void initialize() {
        cbTipoCaja.getItems().addAll("Manual","Automatica");



    }



    public void setApplication(Main main) {
        this.main=main;
    }
}

package alquilafacil.alquila_facil1.application;



import alquilafacil.alquila_facil1.controller.InicioController;
import alquilafacil.alquila_facil1.controller.RegistroClientesController;
import alquilafacil.alquila_facil1.controller.RegistroVehiculosController;
import alquilafacil.alquila_facil1.model.AlquilaFacil;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws IOException {

        this.stage=primaryStage;
        mostrarInicio();


    }
    public void mostrarInicio() {
        try {
            stage.close();
            stage = new Stage();
            //Loader lee cada línea de código y la vuelve objetos en memoria
            FXMLLoader loader = new FXMLLoader();
            //Dirección del paquete donde está la interfaz
            loader.setLocation(Main.class.getResource("/view/inicio.fxml"));
            AnchorPane rootLayout = loader.load();
            //Carga los controladores
            InicioController controller = loader.getController();//Obtenemos el controlador
            controller.setApplication(this);
            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
            // de cambiar de ventana con escape
            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
            stage.show();//Muestra el escenario principal
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrarRegistroCliente() {
        try {
            stage.close();
            stage = new Stage();
            //Loader lee cada línea de código y la vuelve objetos en memoria
            FXMLLoader loader = new FXMLLoader();
            //Dirección del paquete donde está la interfaz
            loader.setLocation(Main.class.getResource("/view/registroClientes.fxml"));
            AnchorPane rootLayout = loader.load();
            //Carga los controladores
            RegistroClientesController controller = loader.getController();//Obtenemos el controlador
            controller.setApplication(this);
            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
            // de cambiar de ventana con escape
            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
            stage.show();//Muestra el escenario principal
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void mostrarRegistroVehiculo() {
        try {
            stage.close();
            stage = new Stage();
            //Loader lee cada línea de código y la vuelve objetos en memoria
            FXMLLoader loader = new FXMLLoader();
            //Dirección del paquete donde está la interfaz
            loader.setLocation(Main.class.getResource("/view/registroVehiculos.fxml"));
            AnchorPane rootLayout = loader.load();
            //Carga los controladores
            RegistroVehiculosController controller = loader.getController();//Obtenemos el controlador
            controller.setApplication(this);
            Scene scene = new Scene(rootLayout);//Carga la escena Principal. En este caso carga el anchor-pane
            // de cambiar de ventana con escape
            stage.setScene(scene);//Al escenario principal se le dice que cargue la escena
            stage.show();//Muestra el escenario principal
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void main(String[] args) {
        launch(args);
    }

}
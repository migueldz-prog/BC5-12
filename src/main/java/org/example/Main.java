
package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox vbox = new VBox(10);
        Label titulo = new Label("Selecciona un pais:");

        ComboBox<String> comboBox = new ComboBox<>();//creo combox string ya que es solo texto
        comboBox.getItems().addAll( //añado todas las opciones
                "España", "Ganha", "Argentina",
                "Portugal", "Chile"
        );

        Label mensajeLabel = new Label("");
        Button button = new Button("Confirmar");

        button.setOnAction(event -> {
            if (comboBox.getValue() == null) { //si no se ha selecionado i es null salta el alert
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setContentText("Seleccionar un pais, por favor");
                alert.showAndWait();
            } else {
                String pais = comboBox.getValue();//si no me muestra el pais selecionado
                mensajeLabel.setText("Pais selecionado: " + pais);
            }
        });

        vbox.getChildren().addAll(titulo, comboBox, button, mensajeLabel);

        Scene scene = new Scene(vbox, 300, 200);
        primaryStage.setTitle("Eje12 - ComboBox paises");
        primaryStage.setScene(scene);
        primaryStage.show();//se crea la escena, se pone titulo, se asigna a la ventana y se hace visible
    }

    public static void main(String[] args) {
        launch(args);
    }

}

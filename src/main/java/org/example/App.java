package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("tela_inicial"));
        stage.setTitle("Exercícios em Java");
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        if (App.class.getResource(fxml + ".fxml") == null) {
            mostrarMensagem("A tela \"" + fxml + ".fxml\" ainda não foi criada.");
            return;
        }
        scene.setRoot(loadFXML(fxml));

        scene.getWindow().sizeToScene();
    }

    static void mostrarMensagem(String mensagem) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        URL arquivo = App.class.getResource(fxml + ".fxml");
        return new FXMLLoader(arquivo).load();
    }

    public static void main(String[] args) {
        launch();
    }
}

package screens;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by jose.m.palma.alonso on 26/01/2017.
 */
public class GestionAlquileres extends Application {

    private static Stage mStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/layouts/initial.fxml"));
        setStage(primaryStage);
        primaryStage.setTitle("A&G Alonso de Castro - Gestión de alquileres");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setMaximized(true);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return mStage;
    }

    public static void setStage(Stage mStage) {
        GestionAlquileres.mStage = mStage;
    }
}
package controllers;

import Utils.MySQLAccess;
import javafx.application.Platform;
import javafx.fxml.FXML;
import model.Lessor;
import screens.LessorScreen;

/**
 * Created by jose.m.palma.alonso on 27/01/2017.
 */
public class MenuController {
    @FXML
    public void openNewLessorWindow(javafx.event.Event event) {
/*        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("/layouts/newLessor.fxml"));

            Stage stage = GestionAlquileres.getStage();
            BorderPane borderPane = (BorderPane) stage.getScene().getRoot();
            borderPane.setRight(root);
        } catch (
                IOException e)

        {
            e.printStackTrace();
        }*/

        LessorScreen.show();
    }
    @FXML
    public void closeApplication(javafx.event.Event event) {
        Platform.exit();
    }

    @FXML
    public void saveLessor(javafx.event.Event event) {
        MySQLAccess.insertUserDB(LessorScreen.getLessor());
    }
}

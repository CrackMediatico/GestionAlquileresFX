package screens;

import Utils.MySQLAccess;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Lessor;

import java.io.IOException;

/**
 * Created by jose.m.palma.alonso on 22/02/2017.
 */
public class LessorScreen {

    private static Lessor mLessor;

    private static Parent root;

    private static LessorScreen ourInstance = new LessorScreen();

    public static LessorScreen show() {
        Stage stage = GestionAlquileres.getStage();
        BorderPane borderPane = (BorderPane) stage.getScene().getRoot();
        borderPane.setRight(root);

        return ourInstance;
    }

    private LessorScreen() {
        try {
            root = FXMLLoader.load(getClass().getResource("/layouts/newLessor.fxml"));
        } catch (
                IOException e)

        {
            e.printStackTrace();
        }
    }

    public static Lessor getLessor() {
        return mLessor;
    }

    public static void setLessor(Lessor lessor) {
        mLessor = lessor;
    }
    /*    @FXML
    public void saveLessor(javafx.event.Event event) {
        MySQLAccess.insertUserDB(mLessor);
    }*/
}

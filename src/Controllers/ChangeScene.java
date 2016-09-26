package Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Ulrik on 26/09/2016.
 */
public class ChangeScene {
    Stage stage = new Stage();

    public void changeToScene(String fxmlFile, String title) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Scene scene = new Scene(root, 1366, 768);


        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }

    public void changeToLogin(String fxmlFile, String title) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Scene scene = new Scene(root, 600, 300);

        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }
}

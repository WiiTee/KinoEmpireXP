package Controllers; /**
 * Created by Lasse on 19/09/16.
 */
import Controllers.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Modality;
import javafx.stage.*;
import javafx.stage.StageStyle;
import javafx.scene.*;

public class Test extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/startscreenView.fxml"));

        Scene scene = new Scene(root, 1366, 768);

            stage.setScene(scene);
            stage.setTitle("Ringkøbing Bio");
            stage.show();

    }

    public static void main(String[] args){
        launch(args);
    }
}
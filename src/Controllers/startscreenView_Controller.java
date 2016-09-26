package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by Flemmer on 22-09-2016.
 */
public class startscreenView_Controller {

    @FXML
    private Button loginBtn;

    ChangeScene changeScene = new ChangeScene();

    @FXML
    void movieClicked() throws Exception{

//        changeScene.changeToScene("movieinfo.fxml", "Model.Movie info");
        changeScene.changeToScene("/View/movieinfo.fxml", "Movie info");
        loginBtn.getScene().getWindow().hide();
    }

    @FXML
    void openLogin() throws Exception{
        changeScene.changeToLogin("/View/Login.fxml", "Login");
        loginBtn.getScene().getWindow().hide();


    }
}

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
public class movieinfo_Controller {

    ChangeScene changeScene = new ChangeScene();

    @FXML
    private Button backBtn;
    @FXML
    private Button reserveBtn;

    @FXML
    void backToView() throws Exception{
        changeScene.changeToScene("startscreenView.fxml", "Overview");
        backBtn.getScene().getWindow().hide();
    }

    @FXML
    void reserve() throws Exception{
        changeScene.changeToScene("tickets1view.fxml", "Reserve Tickets");
        reserveBtn.getScene().getWindow().hide();
    }

}

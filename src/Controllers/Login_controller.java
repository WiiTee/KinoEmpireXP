package Controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Login_controller {

    @FXML
    private BorderPane loginPane;

    @FXML
    private Button loginbtn;

    @FXML
    private Button closebtn;

    @FXML
    void closeWindow() {
        Platform.exit();
    }

    @FXML
    void loginAction() throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../View/startscreenView.fxml"));
        Scene scene = new Scene(root, 1366, 768);
        Stage stage = new Stage();

        loginbtn.getScene().getWindow().hide();

        stage.setScene(scene);
        stage.setTitle("Ringkøbing Bio");
        stage.show();


    }

}


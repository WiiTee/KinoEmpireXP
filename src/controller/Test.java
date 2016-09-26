package controller;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Test extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception
    {
        ViewOrder viewOrder = new ViewOrder();

        Parent root = FXMLLoader.load(getClass().getResource("/view/customerOrder.fxml"));
        primaryStage.setTitle("Kunde Ordre");
        primaryStage.setScene(new Scene(root, 1366, 768));
        primaryStage.show();
        viewOrder.updateTableView();
    }


    public static void main(String[] args)
    {
        launch(args);
    }

}

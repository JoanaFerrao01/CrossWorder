package pt.joanamassas.crossworder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pt.joanamassas.crossworder.Controllers.SceneController;

import java.io.IOException;

public class GameApplication extends Application {
    SceneController sc;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameApplication.class.getResource("startUpMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        sc = SceneController.getInstance();
        sc.setMainScene(scene);
        sc.addPane("startUpMenu");

        stage.setTitle("CrossWorder");
        stage.setScene(scene);
        stage.show();
        }

    public static void main(String[] args) {
        launch();
    }
}
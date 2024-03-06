package pt.joanamassas.crossworder.Controllers.FXMLControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import pt.joanamassas.crossworder.Controllers.SceneController;

public class startUpMenuController {
    SceneController sc = SceneController.getInstance();

    @FXML
    private void startGame(ActionEvent event){

    }

    @FXML
    private void gitHub(ActionEvent event){
        sc.showPane("gitHub");
    }
}
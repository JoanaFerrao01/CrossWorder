package pt.joanamassas.crossworder.Controllers.FXMLControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import pt.joanamassas.crossworder.Controllers.SceneController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class gitHubController {
    SceneController sc = SceneController.getInstance();
    @FXML
    private void back(){
        sc.showPane("startUpMenu");
    }
    @FXML
    private void gitHubLink(){
        try {
            java.awt.Desktop.getDesktop().browse(new URL("https://github.com/JoanaFerrao01").toURI());
        } catch (IOException e ) {
            return;
        } catch (URISyntaxException e) {
            return;
        }
    }
}
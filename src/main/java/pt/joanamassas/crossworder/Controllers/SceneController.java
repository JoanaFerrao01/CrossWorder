package pt.joanamassas.crossworder.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import java.util.HashMap;

//singleton!
public class SceneController {
    private static SceneController instance = null;

    private HashMap<String, Pane> screenMap = new HashMap<>();
    private Scene mainScene;

    public static synchronized SceneController getInstance(){
        if(instance == null)
            instance = new SceneController();

        return instance;
    }

    public void setMainScene(Scene mainScene){
        this.mainScene = mainScene;
    }


    public boolean addPane(String paneName, Pane pane){
        if(paneName.isEmpty() || pane == null)
            return false;
        try{
            screenMap.put(paneName,pane);
            return true;
        }
        catch (Exception e){return  false;}
    }

    public boolean addPane(String paneName){
        if(paneName.isEmpty())
            return false;
        try{
            Pane p = FXMLLoader.load(getClass().getResource("/src/main/resources/pt/joanamassas/crossworder/" + paneName.concat(".fxml")));
            screenMap.put(paneName,p);

            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
    public boolean addPane(String paneName, String FXMLFileName) {
        if(paneName.isEmpty() ||FXMLFileName.isEmpty() )
            return false;

        try{
            screenMap.put(paneName,FXMLLoader.load(getClass().getResource("/src/main/resources/pt/joanamassas/crossworder/"+FXMLFileName)));
            return true;
        }
        catch (Exception e){
            return false;}
    }

    public boolean removePane(String paneName){
        try {
            screenMap.remove(paneName);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void showPane(String name){
        if(screenMap.get(name) == null) //doesnt exist in hashmap: try add it
            if(!addPane(name)) //could not add
                return; //no change


        //all good, hashmap has the pane:
        mainScene.setRoot(screenMap.get(name)); //change to it
    }
}

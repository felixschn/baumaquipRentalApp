package main;

import gui.MainPageController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private Stage stage;


    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        mainPage();


    }

    public void mainPage(){
        try{
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("main_page.fxml"));
        VBox box = loader.load();

        MainPageController mainPageController = loader.getController();
        mainPageController.setMain(this);
        Scene scene = new Scene(box);
        stage.setScene(scene);
        stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){launch (args);}
}

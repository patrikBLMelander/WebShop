package shoeWebshop.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ChangeView {

    private static Stage currentStage;

    public static void setCurrentStage(Stage primaryStage) {
        currentStage = primaryStage;
    }

    public static void changeScenes(Scene scene){
            currentStage.setScene(scene);
            currentStage.show();
    }

    public static Scene loginView() {
        Scene loginScene = null;
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(ChangeView.class.getClassLoader().getResource("view/login.fxml")));
            loginScene = new Scene(root);
        }catch (IOException e){
            e.printStackTrace();
        }
        return loginScene;
    }

}
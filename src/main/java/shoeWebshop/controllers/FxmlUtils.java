package shoeWebshop.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FxmlUtils {

    private static Stage currentStage;

    public static void showMessage(String message, String title, Alert.AlertType alertType){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void setCurrentStage(Stage primaryStage) {
        currentStage = primaryStage;
    }

    public static void changeScenes(Scene scene){
            currentStage.setScene(scene);
            currentStage.show();
    }

    public static Scene homeView() {
        Scene scene = null;
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(FxmlUtils.class.getClassLoader().getResource("view/main.fxml")));
            scene = new Scene(root);
        }catch (IOException e){
            e.printStackTrace();
        }
        return scene;
    }

    public static Scene productView() {
        Scene scene = null;
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(FxmlUtils.class.getClassLoader().getResource("view/product.fxml")));
            scene = new Scene(root);
        }catch (IOException e){
            e.printStackTrace();
        }
        return scene;
    }

    public static Scene reviewView() {
        Scene scene = null;
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(FxmlUtils.class.getClassLoader().getResource("view/review.fxml")));
            scene = new Scene(root);
        }catch (IOException e){
            e.printStackTrace();
        }
        return scene;
    }

    public static Scene orderView() {
        Scene scene = null;
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(FxmlUtils.class.getClassLoader().getResource("view/order.fxml")));
            scene = new Scene(root);
        }catch (IOException e){
            e.printStackTrace();
        }
        return scene;
    }


    public static Scene loginView() {
        Scene scene = null;
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(FxmlUtils.class.getClassLoader().getResource("view/login.fxml")));
            scene = new Scene(root);
        }catch (IOException e){
            e.printStackTrace();
        }
        return scene;
    }

}
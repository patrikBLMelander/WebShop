package shoeWebshop.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private Label navHome;

    @FXML
    private Label navProduct;

    @FXML
    private Label navReview;

    @FXML
    private Label navOrders;

    @FXML
    private Label navLogin;

    public void changeToHomeView(){
        ChangeView.changeScenes(ChangeView.homeView());
    }

    public void changeToProductView(){
        ChangeView.changeScenes(ChangeView.productView());
    }

    public void changeToReviewView() {
        ChangeView.changeScenes(ChangeView.reviewView());
    }

    public void changeToOrderView(){
        ChangeView.changeScenes(ChangeView.orderView());
    }

    public void changeToLoginView(){
        ChangeView.changeScenes(ChangeView.loginView());
    }



}

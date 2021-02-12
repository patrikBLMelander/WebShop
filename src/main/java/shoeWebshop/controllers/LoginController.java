package shoeWebshop.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import shoeWebshop.model.Utils.Database;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Label loggedIn;

    @FXML
    private TextField loginEmail;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Label loginText;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        loginEmail.setPromptText("Email");
        loginPassword.setPromptText("Password");
        if (FxmlUtils.isLoggedIn){
            loggedIn.setText("Logged in: " + FxmlUtils.whoIsLoggedIn);
        }else{
            loggedIn.setText("Logged in: not logged in");
        }
    }

    public void authorizeLogin(){

        if (loginEmail.getText().isEmpty() || loginPassword.getText().isEmpty()){

            FxmlUtils.showMessage("Input", "You need to enter a email\nand a password",null, Alert.AlertType.ERROR);

        } else if(Database.isAuthorizeLogin(loginEmail.getText(),loginPassword.getText())){

            FxmlUtils.isLoggedIn = true;

            loginText.setText("Welcome " + FxmlUtils.whoIsLoggedIn.getFullName());
            loggedIn.setText("Logged in: " + FxmlUtils.whoIsLoggedIn.getFullName());
            loginEmail.setText("");
            loginPassword.setText("");

        }else {
            FxmlUtils.showMessage("Warning", "Wrong email or password, try again",null, Alert.AlertType.ERROR);
        }
    }

    //---- Nav Links ----\\

    public void changeToHomeView(){
        FxmlUtils.changeScenes(FxmlUtils.homeView());
    }

    public void changeToProductView(){
        FxmlUtils.changeScenes(FxmlUtils.productView());
    }

    public void changeToReviewView() { FxmlUtils.changeScenes(FxmlUtils.reviewView()); }

    public void changeToOrderView(){
        FxmlUtils.changeScenes(FxmlUtils.orderView());
    }

    public void changeToLoginView(){
        FxmlUtils.changeScenes(FxmlUtils.loginView());
    }

    public void changeToCreateUserView(){
        FxmlUtils.changeScenes(FxmlUtils.createUserView());
    }

    public void loggOut() {
        FxmlUtils.isLoggedIn = false;
        loggedIn.setText("");
        FxmlUtils.whoIsLoggedIn = null;
        FxmlUtils.changeScenes(FxmlUtils.homeView());
    }

}

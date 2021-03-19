package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author StarsEnd
 * @since 2021-02-19
 */
public class LoginController {
    @FXML
    private Button loginButton;
    @FXML
    private Label versionLabel;

    @FXML
    public void onButtonClick(ActionEvent event) {
        versionLabel.setText("HelloWorld");
        var stage = loginButton.getScene().getWindow();
        stage.hide();
        //MainLoader mainLoader=new MainLoader();
    }

    @FXML
    public void openHorizonWebsite(ActionEvent event) throws IOException {
        System.out.println("sssss");
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"www.horizonst.top");
    }

}

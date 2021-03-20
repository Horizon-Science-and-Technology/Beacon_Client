package controllers;

import com.jfoenix.controls.JFXDialog;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.time.LocalDateTime;

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
    private JFXDialog dialog;
    @FXML
    private AnchorPane context;
    @FXML
    private Label time;
    private StackPane dialogStackPane = new StackPane();

    @FXML
    public void onButtonClick(ActionEvent event) {
        versionLabel.setText("HelloWorld");
        var stage = loginButton.getScene().getWindow();
        stage.hide();
        // MainLoader mainLoader=new MainLoader();
    }

    @FXML
    public void openHorizonWebsite(ActionEvent event) throws IOException {
        System.out.println("sssss");
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"www.horizonst.top");
    }

    @FXML
    public void openDialog(ActionEvent event){
        addDialogStackPane();
        dialog.setTransitionType(JFXDialog.DialogTransition.CENTER);
        dialog.show(dialogStackPane);

    }
    @FXML
    private void addDialogStackPane() {
        dialogStackPane.setPrefHeight(context.getHeight());
        dialogStackPane.setPrefWidth(context.getWidth());
        context.getChildren().add(dialogStackPane);
    }
    @FXML
    public void closeDialog() {
        dialog.close();
        dialogStackPane.getChildren().remove(dialog);
        context.getChildren().remove(dialogStackPane);
    }
    @FXML
    public void initialize() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            int second = LocalDateTime.now().getSecond();
            int minute = LocalDateTime.now().getMinute();
            int hour = LocalDateTime.now().getHour();
            time.setText(hour + ":" + (minute) + ":" + second);
        }),
                new KeyFrame(Duration.seconds(1))
        );
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

}

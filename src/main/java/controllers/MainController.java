package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author StarsEnd
 * @since 2021-02-20
 */
public class MainController {
    @FXML
    private Button exit;
    @FXML
    private MenuBar mb1;
    @FXML
    private FlowPane FP1;

    @FXML
    public void ExitClick(ActionEvent event) {
        var stage = exit.getScene().getWindow();
        stage.hide();
    }
    @FXML
    public void weighChange(ActionEvent event){
        var stage = exit.getScene();
        mb1.setPrefWidth(stage.getWidth()-exit.getWidth());
    }

}

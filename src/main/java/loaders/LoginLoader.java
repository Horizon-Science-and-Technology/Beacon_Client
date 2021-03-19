package loaders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author StarsEnd
 * @since 2021-03-19
 */
public class LoginLoader extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(getClass());
        try {
            // Read file fxml and draw interface.
            Parent root = FXMLLoader.load(getClass()
                    .getResource("../fxml/login.fxml"));
            primaryStage.setTitle("BEACON");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.getIcons().add(new Image("images/BEACON_logo.png"));
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        launch(args);
    }
}

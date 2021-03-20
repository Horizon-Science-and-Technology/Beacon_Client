package loaders;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author StarsEnd
 * @since 2021-03-19
 */
public class LoginLoader extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println(getClass());
        Loader loading = new Loader("loading");
        loading.setStageStyle(StageStyle.TRANSPARENT).getStage().show();

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                        loading.getStage().hide();
                        //更新JavaFX的主线程的代码放在此处
                        Loader login = new Loader("login").setStageStyle(StageStyle.UNDECORATED);
                        login.getStage().show();;
                        executorService.shutdownNow();
                    }
                });

            }
        });

        /*
        try {
            // Read file fxml and draw interface.
            Parent root = FXMLLoader.load(getClass()
                    .getResource("../fxml/login.fxml"));
            primaryStage.setTitle("BEACON");
            Scene scene=new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.getIcons().add(new Image("images/BEACON_logo.png"));
            primaryStage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }*/
    }
    public static void main(String[] args){
        launch(args);
    }
}

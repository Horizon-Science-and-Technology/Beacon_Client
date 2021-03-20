package loaders;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * @author StarsEnd
 * @since 2021-03-20
 */
public class Loader {
	Stage stage = new Stage();

	public Loader(String FXML){
		System.out.println(getClass());
		try {
			// Read file fxml and draw interface.
			Parent root = FXMLLoader.load(getClass()
					.getResource("../fxml/"+FXML+".fxml"));
			stage.setTitle("BEACON");
			Scene scene=new Scene(root);
			stage.setScene(scene);
			scene.setFill(null);
			stage.setResizable(false);
			stage.getIcons().add(new Image("images/BEACON_logo.png"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public Stage getStage(){
		return stage;
	}
	public Loader setStageStyle(StageStyle stageStyle){
		this.stage.initStyle(stageStyle);
		System.out.println(stage.toString());
		return this;
	}
}

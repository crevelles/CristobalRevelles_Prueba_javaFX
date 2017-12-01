package control;
	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.fxml.FXMLLoader;


/**
 * Clase principal que arranca la APP.
 * @author Cristóbal Revelles
 * @version 1.0
 * @see ControlFX
 * @since Diciembre 2017
 */

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("../vista/Login.fxml"));
			Scene scene = new Scene(root,1000,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Font.loadFont(getClass().getResourceAsStream("PoiretOne-Regular.ttf"), 14);
			Font.loadFont(getClass().getResourceAsStream("DK Honeyguide Caps.otf"), 14);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

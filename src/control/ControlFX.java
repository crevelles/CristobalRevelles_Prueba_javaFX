package control;

import java.awt.Button;
import java.io.IOException;

import control.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlFX {
	
	
	@FXML
	private Button abrirVentana;
	
	
	@FXML
	 public void abrirVentana() {
	        try {
	            FXMLLoader loader = new FXMLLoader();
	            loader.setLocation(Main.class.getResource("../vista/FreeSolo.fxml"));
	            AnchorPane page = (AnchorPane) loader.load();
	            Stage sendStage = new Stage();
	            sendStage.setTitle("Superheader");
	            Scene scene = new Scene(page);
	            sendStage.setScene(scene);
	            sendStage.show();
	           

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	@FXML
    private void cerrar() {
   	    System.exit(0);
   	    
    }
	 
	 
	
	
}

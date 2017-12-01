package control;

import java.awt.Button;
import java.io.IOException;

import control.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;




/**
 * Clase que controla la l�gica de la APP.
 * @author Crist�bal Revelles
 * @version 1.0
 * @since Diciembre 2017
 */

public class ControlFX {
	
	
	@FXML
	private Button abrirVentana;
	
	
	
	
	/** Este m�todo abre la segunda ventana*/
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
	
	
	/**
	 * Este m�todo cierra la aplicaci�n
	 */
	@FXML
    private void cerrar() {
   	    System.exit(0);
   	    
    }
	 
	 
	
	
}

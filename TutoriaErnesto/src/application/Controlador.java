package application;
/**
 * @author juanc
 */

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {

	private AnchorPane mypane2;
	@FXML
	private void openStage() {
		
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Vista.fxml"));
			//asociar el cargador al panel
			mypane2 = (AnchorPane) loader.load();
			Scene scene = new Scene(mypane2);
			// añadimos la construccion del stage en el controlador.
			Stage primaryStage = new Stage();
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	}
	


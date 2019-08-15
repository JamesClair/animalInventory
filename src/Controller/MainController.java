/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author james.clair
 */
public class MainController implements Initializable {

	Stage stage;
	Parent scene;
	
	
   	@FXML
        void onActionCreateAnimal(ActionEvent event) throws IOException {
		//TODO: Next 4 lines repeat.  Turn into method.
        	stage = (Stage)((Button)event.getSource()).getScene().getWindow();
		scene = FXMLLoader.load(getClass().getResource("/View/CreateAnimalMenu.fxml"));
		stage.setScene(new Scene(scene));
		stage.show();
	}

        @FXML
        void onActionDisplayAnimal(ActionEvent event) throws IOException {
		stage = (Stage)((Button)event.getSource()).getScene().getWindow();
		scene = FXMLLoader.load(getClass().getResource("/View/DisplayAnimalMenu.fxml"));
		stage.setScene(new Scene(scene));
		stage.show();
        }

        @FXML
        void onActionExit(ActionEvent event) {
               System.exit(0);
        }

	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	


	
}

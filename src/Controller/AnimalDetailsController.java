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
public class AnimalDetailsController implements Initializable {

	Stage stage;
	Parent scene;
	
        @FXML
        private Label animalIdLbl;

        @FXML
        private Label breedLbl;

        @FXML
        private Label lifespanLbl;

        @FXML
        private Label behaviorLbl;

        @FXML
        private Label priceLbl;

        @FXML
        private Label vaccLbl;

        @FXML
        private Label specialLbl;

        @FXML
        void onActionDisplayMainMenu(ActionEvent event) throws IOException {
                stage = (Stage)((Button)event.getSource()).getScene().getWindow();
		scene = FXMLLoader.load(getClass().getResource("/View/MainMenu.fxml"));
		stage.setScene(new Scene(scene));
		stage.show();
	}
	
	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	


	
}

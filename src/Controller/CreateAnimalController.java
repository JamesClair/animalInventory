/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataProvider;
import Model.Dog;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author james.clair
 */
public class CreateAnimalController implements Initializable {

	Stage stage;
	Parent scene;

   	 @FXML
   	 private TextField animalIdTxt;

   	 @FXML
   	 private TextField breedTxt;

   	 @FXML
   	 private TextField lifespanTxt;

   	 @FXML
   	 private TextField behaviorTxt;

   	 @FXML
   	 private TextField priceTxt;

   	 @FXML
   	 private RadioButton vaccYesRBtn;

   	 @FXML
   	 private RadioButton vaccNoRBtn;

         @FXML
         void onActionDisplayMainMenu(ActionEvent event) throws IOException {
                stage = (Stage)((Button)event.getSource()).getScene().getWindow();
		scene = FXMLLoader.load(getClass().getResource("/View/MainMenu.fxml"));
		stage.setScene(new Scene(scene));
		stage.show();
         }

         @FXML
         void onActionSaveAnimal(ActionEvent event) throws IOException {
         	
		 try {
			
			int id =  Integer.parseInt(animalIdTxt.getText());
         		String breed = breedTxt.getText();
			int lifespan = Integer.parseInt(lifespanTxt.getText());
         		String behavior = behaviorTxt.getText();
			double price = Double.parseDouble(priceTxt.getText());
			boolean isVaccinated = false;
			String special = null;
			if(vaccYesRBtn.isSelected())
				isVaccinated = true;
			
			
			DataProvider.addAnimal(new Dog(id, breed, lifespan, behavior, price, isVaccinated, special));
		
			
			stage = (Stage)((Button)event.getSource()).getScene().getWindow();
			scene = FXMLLoader.load(getClass().getResource("/View/MainMenu.fxml"));
			stage.setScene(new Scene(scene));
			stage.show();
		}
		
		catch(NumberFormatException e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);				
			alert.setTitle("Error Dialog");
			alert.setContentText("Please enter a valid value for each field!");
			alert.showAndWait();
		}
		 
		 
         }
	


	/**
	 * Initializes the controller class.
	 */
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	
}

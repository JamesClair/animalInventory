/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Animal;
import Model.DataProvider;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author james.clair
 */
public class DisplayAnimalController implements Initializable {

	Stage stage;
	Parent scene;
	

   	@FXML
   	private TableView<Animal> animalTableView;
	
	@FXML
        private TableColumn<Animal, Integer> animalIdCol;

        @FXML
        private TableColumn<Animal, Integer> lifespanCol;

        @FXML
        private TableColumn<Animal, String> breedCol;

        @FXML
        private TableColumn<Animal, Double> priceCol;	


        @FXML
        void onActionDisplayAnimalDetails(ActionEvent event) {

        }

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
		animalTableView.setItems(DataProvider.getAllAnimals());
		animalIdCol.setCellValueFactory(new PropertyValueFactory<>("id"));
		breedCol.setCellValueFactory(new PropertyValueFactory<>("breed"));
		lifespanCol.setCellValueFactory(new PropertyValueFactory<>("lifespan"));
		priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
	}	

	
}

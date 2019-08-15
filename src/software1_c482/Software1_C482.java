/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software1_c482;

import Model.DataProvider;
import Model.Dog;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author james.clair
 */
public class Software1_C482 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/View/MainMenu.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	//TODO: create an object list for dogs
        Dog dog1 = new Dog(1, "Siberian Husky", 15, "Crafty", 599.99, true, "Whistles");
        Dog dog2 = new Dog(2, "Alaskan Malamute", 12, "Energetic", 999.99, true, "Climbs");
        Dog dog3 = new Dog(3, "Dalmation", 13, "Energetic", 1999.99, true, "Gymnast");
        Dog dog4 = new Dog(4, "Dogo Argentino", 12, "Protective", 1599.99, true, "Whistles");
        Dog dog5 = new Dog(5, "Anatolian Shepherd", 12, "Intelligent", 299.99, true, "Gymnast");

	DataProvider.addAnimal(dog1);
	DataProvider.addAnimal(dog2);
	DataProvider.addAnimal(dog3);
	DataProvider.addAnimal(dog4);
	DataProvider.addAnimal(dog5);

	launch(args);
    }
    
}

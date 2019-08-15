/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author james.clair
 */
public class Dog extends Animal{
	private String special;
	
	public Dog(int id, String breed, int lifespan, String behavior, double price, boolean vaccinated, String special) {
		super(id, breed, lifespan, behavior, price, vaccinated);
		this.special = special;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}
	
}

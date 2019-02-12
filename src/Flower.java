/**
 * @author Mohammed Kadiri
 * Write a Java class, Flower, that has three instance variables of type String, int,
 * and float, which respectively represent the name of the flower, its number of
 * petals, and price. Your class must include a constructor method that initializes
 * each variable to an appropriate value, and your class should include methods for
 * setting the value of each type, and getting the value of each type.
 */

import java.util.Scanner;

public class Flower {
	
	// Instance variables
	protected String name;
	
	protected int petals;
	
	protected float price;
	
	/**
	 * Constructor to initialise a Flower instance
	 * @param name
	 * @param petals
	 * @param price
	 */
	
	public Flower(String name, int petals, float price) {
		this.name = name;
		this.petals = petals;
		this.price = price;
	}
	
	// Setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPetals(int petals) {
		this.petals = petals;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	// Getter methods
	public String getName() {
		return this.name;
	}
	
	public int getPetals() {
		return this.petals;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public static void FlowerDescription(Flower fl) {
		System.out.println("Flowers name: " + fl.getName());
		System.out.println("Flowers petals: " + fl.getPetals());
		System.out.println("Flowers price: " + fl.getPrice());
	}
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Flower rose = new Flower("rose", 5, 17.80f);
		Flower jasmine = new Flower("jasmine", 6, 18.90f);
		
		rose.FlowerDescription(rose);
		jasmine.FlowerDescription(jasmine);
		
		rose.setPetals(9);
		rose.FlowerDescription(rose);
	}

}

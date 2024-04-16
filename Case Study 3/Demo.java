/**
 * This Demo program simulates a simple inventory and sales system for fruits.
 * It includes classes to represent different types of fruits sold by kilograms
 * and pieces, as well as a class for managing sale transactions.
 * 
 * The program consists of the following classes:
 * - Fruit: Represents a basic fruit item with a unique code and name.
 * - Fruitingms: Extends Fruit class to represent fruits sold by kilograms,
 *               with fields for available kilograms and price per kilogram.
 * - Fruitinpcs: Extends Fruit class to represent fruits sold by pieces,
 *               with fields for available pieces and price per piece.
 * - Sale: Manages sale transactions, including the fruit being sold, quantity,
 *         and total amount, with functionality for calculating bills and applying discounts.
 * - Demo: Contains the main method for demonstrating the program's functionality,
 *         including creating fruit and sale objects and simulating sales transactions.
 * 
 * @author Cassidy Fernandez
 * @author Dominic Syd Aldas
 * @author Joshua Macatunao
 * @author Rafael Lafuente
 * 
 * @version April 8, 2024
 */


// Class for fruits that holds information about the fruit
class Fruit {
	private int code;
	private String name;
	static int counter = 1000;

	Fruit(String name) {
		this.name = name;
	}
} //end class Fruit


// Class for fruit per kg that extends the class fruit for inheirtance of some attribute
class Fruitingms extends Fruit {
	private double available_kgs;
	private double price_per_kg;

	Fruitingms(String name, double available_kgs, double price_per_kg) {
		super(name);
		this.available_kgs = available_kgs;
		this.price_per_kg = price_per_kg;
	}


	// Method that returns the price per kg upon calling
	public double getprice() {
		return price_per_kg;
	}



	// Method that returns boolean value for availability
	public boolean checkavailability(double need) {
		//write your code here
		if(available_kgs < need) {
			return false;
		}
		return true;
	}



	// method that updates the availability
	public void updateavailability(double need) {
		//write your code here
		available_kgs = available_kgs - need;
	}
} //end class Fruitingms


// Class for fruit per piece that extends class Fruit for inheritance of some attributes
class Fruitinpcs extends Fruit {
	private double available_pcs;
	private double price_per_piece;

	// Constructor method for fruit sold by piece
	Fruitinpcs(String name, double available_pcs, double price_per_piece) {
		//write your code here
		super(name);
		this.available_pcs = available_pcs;
		this.price_per_piece = price_per_piece;
	}

	// method that returns price per piece upon calling
	public double getprice() {
		return price_per_piece;
	}


	// method that returns boolean value for fruit availability
	public boolean checkavailability(double need) {
		//write your code here
		if(available_pcs<need) {
			return false;
		}
		return true;
	}

	// method that updates availability upon checking
	public void updateavailability(double need) {
			available_pcs = available_pcs - need;
	}
} //end class Fruitinpcs


class Sale {
	private int code;
	private Fruit fobj;
	private double unit;
	private double amount;
	static int counter = 2000;

	// Constructor method for sale information
	Sale(Fruit fobj, double unit) {
		this.fobj = fobj;
		this.unit = unit;
	}

	// method for billing
	public double bill() {
		//write your code here
		if(!((Fruitingms) fobj).checkavailability(unit)) {
			System.out.println("Item not available");
			return 0.0;
		}
		amount = ((Fruitingms) fobj).getprice() * unit;

		if(amount > 1500) {
			amount = discount();
		}
		((Fruitingms) fobj).updateavailability(unit);

		return amount;
	}

	// method that applies discount if the price is above P1500.00
	public double discount() {
		int disc = (int)amount/100 * 5;
		amount = amount - disc;
		return amount;
	}
} //end class Sale


// Class Demo (Main Class) that contains the main method
class Demo {
	public static void main(String args[]) {
		Fruit fobj = new Fruitingms("apple",50.6,80.0);
		Sale s = new Sale(fobj,2.0);
		System.out.println(s.bill());
		Fruit fobj1 = new Fruitinpcs("banana",200,3.0);
		Sale s1 = new Sale(fobj,10);
		System.out.println(s1.bill());
	}
}

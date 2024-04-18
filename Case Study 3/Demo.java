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
 * @version April 19, 2024
 */


// What is this?
class Fruit {
	private int code;
	private String name;
	static int counter = 1000;

	Fruit(String name) {
		this.name = name;
	}
} //end class Fruit


// What is this?
class Fruitingms extends Fruit {
	private double available_kgs;
	private double price_per_kg;

	Fruitingms(String name, double available_kgs, doubleprice_per_kg) {
		super(name);
		this.available_kgs = available_kgs;
		this.price_per_kg = price_per_kg;
	}


	// What is this?
	public double getprice() {
		return price_per_kg;
	}



	// What is this?
	public boolean checkavailability(double need) {
		//write your code here
		if(available_kgs < need) {
			return false;
		}
		return true;
	}



	// What is this?
	public void updateavailability(double need) {
		//write your code here
		available_kgs = available_kgs - need;
	}
} //end class Fruitingms


// What is this?
class Fruitinpcs extends Fruit {
	private double available_pcs;
	private double price_per_piece;

	// What is this?
	Fruitinpcs(String name, double available_pcs, doubleprice_per_piece) {
		//write your code here
		super(name);
		this.available_pcs = available_pcs;
		this.price_per_piece = price_per_piece;
	}

	// What is this?
	public double getprice() {
		return price_per_piece;
	}


	// What is this?
	public boolean checkavailability(double need) {
		//write your code here
		if(available_pcs<need) {
			return false;
		}
		return true;
	}

	// What is this?
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

	// What is this?
	Sale(Fruit fobj, double unit) {
		this.fobj = fobj;
		this.unit = unit;
	}

	// What is this?
	public double Bill() {
		//write your code here
		if(!fobj.checkavailability(unit)) {
			System.out.println("Item not available");
			return false;
		}
		amount = fobj.getprice() * unit;

		if(amount > 1500) {
			amount = discount();
		}
		fobj.pdateavailability(unit);

		return amount;
	}

	// What is this?
	public double discount() {
		int disc = amount/100 * 5;
		amount = amount - disc;
		return amount;
	}
} //end class Sale


// What is this?
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
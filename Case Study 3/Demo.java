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


/**
 * Represents a fruit entity with a unique identifier and a name.
 */
class Fruit {
    private int code; 			// Unique code for the fruit
    private String name; 		// Name of the fruit
    static int counter = 1000; 	// Static counter for generating unique codes

    /**
     * Constructs a new Fruit with the specified name.
     *
     * @param name Represents the name of the fruit
     */
    Fruit(String name) {
        this.name = name;
    }
} //end class Fruit


/**
 * Represents fruit sold by weight, extending the Fruit class to inherit some attributes.
 */
class Fruitingms extends Fruit {
    private double available_kgs; // Available kilograms of the fruit
    private double price_per_kg; // Price per kilogram of the fruit

    /**
     * Constructs a new Fruitingms with the specified name, available kilograms, and price per kilogram.
     *
     * @param name          Representsthe name of the fruit
     * @param available_kgs Represents the available kilograms of the fruit
     * @param price_per_kg  Represents the price per kilogram of the fruit
     */
    Fruitingms(String name, double available_kgs, double price_per_kg) {
        super(name);
        this.available_kgs = available_kgs;
        this.price_per_kg = price_per_kg;
    }


    /**
     * Retrieves the price per kilogram of the fruit.
     *
     * @return double The price per kilogram of the fruit.
     */
    public double getPrice() {
        return price_per_kg;
    }


    /**
     * Checks if the required kilograms of fruit are available.
     *
     * @param need Represents the required kilograms of fruit
     * 
     * @return boolean Returns true if available, false otherwise
     */
    public boolean checkAvailability(double need) {
    	//write your code here
        return available_kgs >= need;
    }


    /**
     * Updates the availability of fruit after purchase.
     *
     * @param need Represents the kilograms of fruit purchased
     */
    public void updateAvailability(double need) {
    	//write your code here
        available_kgs -= need;
    }
} //end class Fruitingms


/**
 * Represents fruit sold by piece, extending the Fruit class to inherit some attributes.
 */
class Fruitinpcs extends Fruit {
    private double available_pcs; 	// Available pieces of the fruit
    private double price_per_piece; // Price per piece of the fruit

    /**
     * Constructs a new Fruitinpcs with the specified name, available pieces, and price per piece.
     *
     * @param name            Represents the name of the fruit
     * @param available_pcs   Represents the available pieces of the fruit
     * @param price_per_piece Represents the price per piece of the fruit
     */
    Fruitinpcs(String name, double available_pcs, double price_per_piece) {
        //write your code here
        super(name);
        this.available_pcs = available_pcs;
        this.price_per_piece = price_per_piece;
    }


    /**
     * Retrieves the price per piece of the fruit.
     *
     * @return double The price per piece of the fruit.
     */
    public double getPrice() {
        return price_per_piece;
    }


    /**
     * Checks if the required pieces of fruit are available.
     *
     * @param need Represents the required pieces of fruit
     * 
     * @return boolean Returns true if available, false otherwise
     */
    public boolean checkAvailability(double need) {
    	// write your code here
        return available_pcs >= need;
    }


    /**
     * Updates the availability of fruit after purchase.
     *
     * @param need Represents the pieces of fruit purchased
     */
    public void updateAvailability(double need) {
        available_pcs -= need;
    }
} //end class Fruitinpcs


/**
 * Represents a sale of fruit.
 */
class Sale {
    private int code; 			// Unique code for the sale
    private Fruit fobj; 		// The fruit object being sold
    private double unit; 		// Quantity of fruit being sold
    private double amount; 		// Total amount for the sale
    static int counter = 2000; 	// Static counter for generating unique sale codes

    /**
     * Constructs a new Sale with the specified fruit object and quantity.
     *
     * @param fobj Represents the fruit object being sold
     * @param unit Represents the quantity of fruit being sold
     */
    Sale(Fruit fobj, double unit) {
        this.fobj = fobj;
        this.unit = unit;
    }


    /**
     * Calculates the bill amount for the sale.
     *
     * @return double Returns the bill amount.
     */
    public double bill() {
        //write your code here
        if (fobj instanceof Fruitingms) {
            Fruitingms fruit = (Fruitingms) fobj;
            if (!fruit.checkavailability(unit)) {
                System.out.println("Item not available");
                return 0.0;
            }
            amount = fruit.getprice() * unit;
            if (amount > 1500) {
                amount = discount();
            }
            fruit.updateavailability(unit);
        } else if (fobj instanceof Fruitinpcs) {
            Fruitinpcs fruit = (Fruitinpcs) fobj;
            if (!fruit.checkavailability(unit)) {
                System.out.println("Item not available");
                return 0.0;
            }
            amount = fruit.getprice() * unit;
            if (amount > 1500) {
                amount -= discount();
            }
            fruit.updateavailability(unit);
        }
        return amount;
    }

    /**
     * Applies a discount if the bill amount is above P1500.00.
     *
     * @return double Returns the discounted amount.
     */
    public double discount() {
        double disc = amount / 100 * 5;
        amount -= disc;
        return amount;
    }
} //end class Sale


/**
 * Main class containing the main method for demonstration.
 */
class Demo {
    public static void main(String args[]) {
        Fruit fobj = new Fruitingms("apple", 50.6, 80.0);
        Sale s = new Sale(fobj, 2.0);
        System.out.println(s.bill());
        Fruit fobj1 = new Fruitinpcs("banana", 200, 3.0);
        Sale s1 = new Sale(fobj1, 10);
        System.out.println(s1.bill());
    }
}

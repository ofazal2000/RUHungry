package restaurant;
/**
 * Use this class to test your Menu method. 
 * This class takes in two arguments:
 * - args[0] is the menu input file
 * - args[1] is the output file
 * 
 * This class:
 * - Reads the input and output file names from args
 * - Instantiates a new RUHungry object
 * - Calls the menu() method 
 * - Sets standard output to the output and prints the restaurant
 *   to that file
 * 
 * To run: java -cp bin restaurant.Menu menu.in menu.out
 * 
 */
public class Menu {
    public static void main(String[] args) {

	// 1. Read input files
	// Option to hardcode these values if you don't want to use the command line arguments
	   
        String inputFile = args[0];
        String outputFile = args[1];
        StdOut.println("INput file: " + inputFile);
        StdOut.println("OUTput file: " + outputFile);
	
        // 2. Instantiate an RUHungry object
        RUHungry rh = new RUHungry();

	// 3. Call the menu() method to read the menu
        rh.menu(inputFile);
        rh.createStockHashTable("stock.in");
        rh.updatePriceAndProfit();
        rh.order ("Water", 22);
        rh.order ("Rutgers Passion Penne", 3);
        rh.order ("Spinach Artichoke Dip", 5);
        rh.order ("Classic Chicken Sandwich", 5);
        rh.order ("Broccoli With Cheese", 2);
        rh.order ("Blue Raspberry Scarlet Pop", 2);
        rh.order ("RU & OG Cheesecake", 4);
        rh.order ("Caesar Salad", 13);
        rh.order ("Mozzarella Sticks", 7);
        rh.order ("Knight Nachos", 18);
        rh.order ("The RU Burger", 6);
        rh.order ("Coca Cola", 17);
        rh.order ("Cheddar Biscuits", 11);
        rh.order ("Kiwi Knight", 3);
        rh.order ("Scarlet Special Salad", 5);
        rh.order ("Fries", 12);
        rh.order ("Roasted Veggies", 1);
        rh.order ("Blue Raspberry Scarlet Pop", 7);
        rh.order ("The RU Burger", 4);
        rh.order ("Water", 10);
        rh.order ("The Scarlet Brownie Sundae", 13);
        rh.order ("Knight Nachos", 12);
        rh.order ("Fries", 7);
        rh.order ("RU & OG Cheesecake", 2);
        rh.order ("Blue Raspberry Scarlet Pop", 6);

	// 4. Set output file
	// Option to remove this line if you want to print directly to the screen
        StdOut.setFile(outputFile);

	// 5. Print restaurant
        rh.printRestaurant();
    }
}

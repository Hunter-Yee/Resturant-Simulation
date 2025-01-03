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
	   
        // String inputFile = args[0];
        // String outputFile = args[1];
        // StdOut.println("Input file: "+inputFile);
        // StdOut.println("Output file: "+outputFile);
	
        // 2. Instantiate an RUHungry object
        RUHungry rh = new RUHungry();

	// 3. Call the menu() method to read the menu
        rh.menu("menu.in");
        rh.createStockHashTable("stock.in");
        rh.updatePriceAndProfit();
        
        StdIn.setFile("order1.in");
        int amt = StdIn.readInt();
        for(int i = 0;i<amt;i++){
                int num = StdIn.readInt();
           StdIn.readChar();
           String item = StdIn.readLine();
           rh.order(item,num);     
        }
        StdIn.setFile("donate1.in");
        int amt1 = StdIn.readInt();
        for(int j = 0;j<amt1;j++){
                int num1 = StdIn.readInt();
                StdIn.readChar();
                String item1 = StdIn.readLine();
                rh.donation(item1, num1);
        }

        // rh.order("Water",40);
        // rh.donation("Water", 27);
        
        

        //StdOut.println("called menu: "+inputFile);

	// 4. Set output file
	// Option to remove this line if you want to print directly to the screen
        //StdOut.setFile(outputFile);

	// 5. Print restaurant
        rh.printRestaurant();
    }
}

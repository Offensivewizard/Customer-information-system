import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Driver {
	
	private static int id;
	
	public static void main(String[] args) {
				
		
		Scanner input = new Scanner(System.in);
		/**boolean to keep the while loop going
		 * 
		 */
		boolean menu = false;
		while(menu != true){
			/**
			 * Numeric entry menu, input recorded with scanner
			 */
		System.out.println("Welcome to the customer information and sales analysis system.");
		System.out.println("Please enter the number corresponding to the option you wish to choose.");
		System.out.println("1. Enter new customer information.");
		System.out.println("2. Export customer information to a file.");
		System.out.println("3. Display value of total sales data from file.");
		System.out.println("4. Analyse sales data to detect potential fraud.");
		System.out.println("5. Exit the program.");
		ArrayList<Customer> details = new ArrayList<Customer>();
		ArrayList<String> salesSum = new ArrayList<String>();
		int option = input.nextInt();
		if (option == 1){
			/**
			 * User enters the information for a specified amount of customers. 
			 * Values stored in Customer objects which are then stored in an arraylist or customers
			 */
			id++;
			System.out.println("How many customers would you like the enter into the system? Please respond with an integer.");
			int cnum = input.nextInt();
	
			for(int i = 0; i < cnum; i++){
				boolean creditCheck = false;
				boolean postalCheck = false;
				long credit = 0;
				String postal = null;
				int y = i+1;
				System.out.println("Enter the First name of customer number "+ y ); 
				String fName = input.next();
				
				System.out.println("Enter the last name of customer number "+ y );
				String lName = input.next();
				
				System.out.println("Enter the city name of customer number "+ y);
				String city = input.next();
				
					while(postalCheck != true){
						/**
						 * Verifies the validity of the users entered postal code. calls the postVal method in the PostalValidation
						 * class
						 */
						System.out.println("Enter the postal code of customer number "+ y + ". Do not use spaces");
						postal = input.next();
						postalCheck = PostalValidation.postVal(postal);
					}
				
				while(creditCheck != true) {
					/**
					 * Verifies the validity of the users entered credit card number. calls the creditValidate
					 *  method in the CreditValidation class
					 */
					System.out.println("Enter the credit card number of customer number " + y);
					credit = input.nextLong();
					creditCheck = CreditValidation.creditValidate(credit);
				}
				
				/**
				 * Customer details are stored in a new customer object, which is then added to the details arraylist
				 */
				Customer customer = new Customer (fName, lName, city, postal, credit);
				details.add(customer);
				int x = details.size();
				System.out.println("Customer data added succesfully");
		}
	}
		if(option == 2){
			/**
			 * The destination and name of the file containing the customer data is obtained from the user
			 */
			System.out.println("Where should the file output to? Please specify the name of the file and a location on your device.");
			String destination = input.next();
			File outFile = new File (destination);
			
		try {
				FileWriter out = new FileWriter(outFile);
				int y = 1 + details.size();
				System.out.println(y);
				for(int i = 0; i<y; i++ ){
					System.out.println("check2");
					out.write(Customer.getfName(details.get(i)) + "," + Customer.getlName(details.get(i)) + "," + Customer.getCity(details.get(i)) + "," + Customer.getPostal(details.get(i)) + ","+ Customer.getCredit(details.get(i)) + ",");
					out.close();
					
				}
			//	System.out.println("The file has been written successfully");
			
			} catch (Exception e) {
				System.out.println("An error has occured.");
				System.out.println(e.getMessage());
			}
				
			
			
			
		}
		if(option == 3) {
			long total = 0;

			try {
				
				String line = "";
				String line2 = "";
				
				File inFile = new File("sales.csv");
				Scanner in = new Scanner(inFile);
				in.nextLine();
				while(in.hasNextLine()){
					line = in.next("\\|");
					line2 =in.nextLine();
					salesSum.add(line2);
					in.nextLine();
				}
				in.close();
				
			} catch (Exception e) {
				System.out.println("An error has occured.");
				System.out.println(e.getMessage());
			}
		}
		
		if(option == 4) {
			/**
			 * Runs the numbers parsed from sales.csv through Benford's law
			 * count integers are initialized for each potential first digit
			 */
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int count4 = 0;
			int count5 = 0;
			int count6 = 0;
			int count7 = 0;
			int count8 = 0;
			int count9 = 0;
			int total = salesSum.size();
			/**
			 * A for loop finds and records the first digit of each entry in the salesSum arraylist, which contains the data
			 * from the sales.csv file
			 */
			for(int i = 0; i<total; i++ ) {
				String temp = salesSum.get(i);
				char x = temp.charAt(0);
				int y = Character.getNumericValue(x);
				if(y == 1) {
					count1++;
				}
				if(y == 2) {
					count2++;
				}
				if(y == 3) {
					count3++;
				}
				if(y == 4) {
					count4++;
				}
				if(y == 5) {
					count5++;
				}
				if(y == 6) {
					count6++;
				}
				if(y == 7) {
					count7++;
				}
				if(y == 8) {
					count8++;
				}
				if(y == 9) {
					count9++;
				}
			}
			/**
			 * A numeric representation of the frequency of each potential first digit is shown
			 */
			System.out.println("The number 1 is the first digit of a sales value " + count1 + " Out of " + total + " times");
			System.out.println("The number 2 is the first digit of a sales value " + count2 + " Out of " + total + " times");
			System.out.println("The number 3 is the first digit of a sales value " + count3 + " Out of " + total + " times");
			System.out.println("The number 4 is the first digit of a sales value " + count4 + " Out of " + total + " times");
			System.out.println("The number 5 is the first digit of a sales value " + count5 + " Out of " + total + " times");
			System.out.println("The number 6 is the first digit of a sales value " + count6 + " Out of " + total + " times");
			System.out.println("The number 7 is the first digit of a sales value " + count7 + " Out of " + total + " times");
			System.out.println("The number 8 is the first digit of a sales value " + count8 + " Out of " + total + " times");
			System.out.println("The number 9 is the first digit of a sales value " + count9 + " Out of " + total + " times");
			double freq = count1/total;
			/**
			 * depending on the frequency of 1 as a first digit the program indicates that fraud either is or isn't unlikely to
			 * have occurred
			 */
			if(freq>0.28 && freq<0.33) {
				System.out.println("The data indicates that fraud likely did not occur.");
			}
			else {
				System.out.println("The data does not indicate that fraud likely did not occur.");
			}
			
		}
		
		if(option == 5) {
			menu = true;
		}
		
		}

}
}

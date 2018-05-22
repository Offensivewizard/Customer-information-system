import java.util.*;
public class Driver {

	public static void main(String[] args) {
				
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the customer information and sales analysis system.");
		System.out.println("Please enter the number corresponding to the option you wish to choose.");
		System.out.println("1. Enter new customer information.");
		
		int option = input.nextInt();
		if (option == 1){
			System.out.println("How many customers would you like the enter into the system? Please respond with an integer.");
			int cnum = input.nextInt();
			for(int i = 0; i < cnum; i++){
				System.out.println("Enter the First name of customer number "+ i );
				ArrayList<String> details = new ArrayList<String>(); 
				String fName = input.next();
				details.add(fName);
				
				System.out.println("Enter the First name of customer number "+ i );
				String lName = input.next();
				details.add(lName);
				
				System.out.println("Enter the city name of customer number "+ i);
				String city = input.next();
				details.add(city);
				
				System.out.println("Enter the postal code of customer number "+ i);
				String postal = input.next();
				//Validate with method in seperate class
				
				System.out.println("Enter the credit card number of customer number " + i);
				String credit = input.next();
				
				
		}
	}

}

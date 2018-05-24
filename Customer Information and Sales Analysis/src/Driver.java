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
			ArrayList<Customer> details = new ArrayList<Customer>();
			for(int i = 0; i < cnum; i++){ 
				System.out.println("Enter the First name of customer number "+ i ); 
				String fName = input.next();
				
				System.out.println("Enter the First name of customer number "+ i );
				String lName = input.next();
				
				System.out.println("Enter the city name of customer number "+ i);
				String city = input.next();
				
				System.out.println("Enter the postal code of customer number "+ i);
				int postal = input.nextInt();
				//Validate with method in separate class
				
				System.out.println("Enter the credit card number of customer number " + i);
				int credit = input.nextInt();
				CreditValidation.creditValidate(credit);
				
				
				Customer customer = new Customer (fName, lName, city, postal, credit);
				details.add(customer);
		}
	}

}
}

import java.util.*;
public class Driver {

	public static void main(String[] args) {
				
		
		Scanner input = new Scanner(System.in);
		boolean menu = false;
		while(menu != true){
		System.out.println("Welcome to the customer information and sales analysis system.");
		System.out.println("Please enter the number corresponding to the option you wish to choose.");
		System.out.println("1. Enter new customer information.");
		
		int option = input.nextInt();
		if (option == 1){
			System.out.println("How many customers would you like the enter into the system? Please respond with an integer.");
			int cnum = input.nextInt();
			ArrayList<Customer> details = new ArrayList<Customer>();
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
						System.out.println("Enter the postal code of customer number "+ y);
						postal = input.next();
						postalCheck = PostalValidation.postVal(postal);
					}
				
				while(creditCheck != true) {
					System.out.println("Enter the credit card number of customer number " + y);
					credit = input.nextLong();
					creditCheck = CreditValidation.creditValidate(credit);
				}
				
				
				Customer customer = new Customer (fName, lName, city, postal, credit);
				details.add(customer);
		}
	}
		
		}

}
}

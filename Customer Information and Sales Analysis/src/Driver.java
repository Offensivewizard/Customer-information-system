import java.util.Scanner;
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
				
			}
		}
	}

}

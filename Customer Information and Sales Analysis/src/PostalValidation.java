import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PostalValidation {
		public static boolean postVal(String postal){
			ArrayList<String> postalCodes = new ArrayList<>();
			/**
			 * Postal code is only checked against the csv file if it's length is sufficient
			 */
			if(postal.length()>2){
			
			try {
				/**
				 * Reads the first three characters from each line of the csv file provided and checks the user's code for matches
				 */
			
				String line = "";
				File inFile = new File("postal_codes.csv");
				Scanner in = new Scanner(inFile);
				while(in.hasNextLine()){
					line = in.nextLine();
					postalCodes.add(line.substring(0, 3));
				}
				in.close();
				
			} catch (Exception e) {
				System.out.println("An error has occured.");
				System.out.println(e.getMessage());
			}
			
			for(int i = 0; i<postalCodes.size(); i++){
				String t = postalCodes.get(i);
				String postal3 = postal.substring(0,3);
				if(postal3.equals(t)){
					return true;
				}
			}
			
			}
			/**
			 * If the user's code is invalid they are asked to enter another one
			 */
			else{
				System.out.println("Error: Invalid postal code. Please try again");
				return false;
			}
			System.out.println("Error: Invalid postal code. Please try again");
			return false; 
		}
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PostalValidation {
		public static boolean postVal(String postal){
			ArrayList<String> postalCodes = new ArrayList<>();
			if(postal.length()>2){
			
			try {
			
				String line = "";
				File inFile = new File("postal_codes.csv");
				Scanner in = new Scanner(inFile);
				//in.nextLine();
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
				if(postal.equals(t)){
					return true;
				}
			}
			
			}
			else{
				System.out.println("Error: Invalid postal code. Please try again");
				return false;
			}
			System.out.println("Error: Invalid postal code. Please try again");
			return false; 
		}
}

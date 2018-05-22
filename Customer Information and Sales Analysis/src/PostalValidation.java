import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class PostalValidation {
		public static boolean postVal(String postal){
		 int length = postal.length();
		 ArrayList<String> postalCodes = new ArrayList<String>();
		 if(length>=3){
			 
				try {

					String[] data;
					String line = "";

					File postFile = new File("postal_codes.csv");
					Scanner in = new Scanner(postFile);
					in.nextLine(); 

					while (in.hasNextLine()) {
						line = in.nextLine();
						data = line.split("//|");
						//postalCodes.add(new (data[0], data[1], Long.parseLong(data[2])));
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
		 }
		 else{
			 return false;
		 }
		return false;
		}
}

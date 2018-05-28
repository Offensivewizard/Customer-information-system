import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PostalValidation {
		public static boolean postVal(String postal){
			ArrayList<PostalCode> inputCode = new ArrayList<PostalCode>();
			
			
			try {
				String[] data;
				String line = "";
				File inFile = new File("postal_codes.csv");
				Scanner in = new Scanner(inFile);
				in.nextLine();
				while(in.hasNextLine()){
					line = in.nextLine();
					data = line.split("//|");
					inputCode.add(new PostalCode(data[0]));
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(postal !=  ){
				
			}
		}
}

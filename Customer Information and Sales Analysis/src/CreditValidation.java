
public class CreditValidation {
		public static boolean creditValidate(long cNum){
			/**
			 * Uses the reverseNum method to return a reversed long, which is then converted into a string
			 */
		long rNum =	reverseNum(cNum);
		String rNumber = String.valueOf(rNum);
	
		int sum1 = 0;
		int sum2 = 0;
		/**
		 * The number is checked using the Lunh algorithm and the length of the number
		 */
		for(int i = 0; i<rNumber.length(); i++) {
			char y = rNumber.charAt(i);
			int t = Character.getNumericValue(y);
			if(i%2 == 0) {
				sum1 += (t);
				
			} 
			
		}
		for (int i = 0; i<rNumber.length(); i++) {
			char y = rNumber.charAt(i);
			int t = Character.getNumericValue(y);
		if(i%2 != 0) {
		
				t=t*2;
				if(t>9) {
					String temp = String.valueOf(t);
					char x = temp.charAt(0);
					char o = temp.charAt(1);
					int u = Character.getNumericValue(x);
					int v = Character.getNumericValue(o);
					int e = v+u;
					sum2 += e;
					
				}
				else {
					sum2 += t;
				}
				
			} 
		}
		int sumTotal = sum1+sum2;
		String sumT = String.valueOf(sumTotal);
		int x = sumT.length();
		char last = sumT.charAt(x-1);
		int lastInt = Character.getNumericValue(last);
		if(lastInt ==0 && rNumber.length()>8) {
			return true;
			
		}
		/**
		 * If the number proves invalid the user is asked to enter another number
		 */
		else {
			System.out.println("Error: Invalid credit card number. Please try again.");
			return false;
		}
		
		
			
			
		}
		/**
		 * Method that returns the inverse of a long variable
		 */
		public static long reverseNum(long num){
			long reverseNum = 0;
			for(long i = num; i!= 0; i/=10 ){
				reverseNum = reverseNum*10 + i %10;
			}
			return reverseNum;
		}
}

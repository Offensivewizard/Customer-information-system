
public class CreditValidation {
		public static boolean creditValidate(int cNum){
			cNum = 12456;
			reverseNum(cNum);
			return true;
			
		}
		public static int reverseNum(int num){
			int reverseNum = 0;
			for(int i = num; i!= 0; i/=10 ){
				reverseNum = num*10 + i %10;
			}
			System.out.println(reverseNum);
			return reverseNum;
		}
}

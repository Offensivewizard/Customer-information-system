
public class Customer {
private static	String firstName;
private static	String lastName;
private static	String cityName;
private static	String postalCode;
private static	String creditNum;
	/**
	 * Customer object, containing the necessary parameters
	 */
	


					public Customer(String fName, String lName, String city, String postal, long credit) {
						firstName =fName;
						lastName = lName;
					cityName = city;
					postalCode = postal;
					creditNum = Long.toString(credit);
						
					}
					
					
					public static String getfName(Customer customer ) {
						return firstName;
					}
					public static String getlName(Customer customer) {
						return lastName;
					}
					public static String getCity(Customer customer) {
						return cityName;
					}
					public static String getPostal(Customer customer) {
						return postalCode;
					}
					public static String getCredit(Customer customer) {
						return creditNum;
					}
					
}

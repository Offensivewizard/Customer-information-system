
public class Customer {
private static	String firstName;
private static	String lastName;
private static	String cityName;
private static	String postalCode;
private static	String creditNum;
	
	


					public Customer(String fName, String lName, String city, String postal, long credit) {
						firstName =fName;
						lastName = lName;
					cityName = city;
					postalCode = postal;
					creditNum = Long.toString(credit);
						
					}
					
					
					public String getfName(Customer customer ) {
						return firstName;
					}
					public String getlName() {
						return lastName;
					}
					public String getCity() {
						return cityName;
					}
					public String getPostal() {
						return postalCode;
					}
					public String getCredit() {
						return creditNum;
					}
					
}

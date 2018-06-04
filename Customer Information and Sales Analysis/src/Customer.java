
public class Customer {
private	String firstName;
private	String lastName;
private	String cityName;
private	String postalCode;
private	String creditNum;
private int idNum;
	/**
	 * Customer object, containing the necessary parameters
	 */
	


					public Customer(String fName, String lName, String city, String postal, long credit,int id ) {
						firstName =fName;
						lastName = lName;
					cityName = city;
					postalCode = postal;
					creditNum = Long.toString(credit);
					idNum = id;
						
					}
					
					
					public String getfName() {
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
					public int getId() {
						return idNum;
					}
					
}

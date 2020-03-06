package pizzaShop;

public class InternetCustomer extends Customer 
{

	private String emailAddress;
	
	public InternetCustomer(String reqName, String reqAddress, String reqEmailAddress) 
	{
		super(reqName, reqAddress);
		emailAddress = reqEmailAddress;
	}
	
	public String toString()
	{
		return super.getName() + "\nAddress: " + super.getAddress() + "\nEmail Address: " + emailAddress;
	}

}

import java.util.ArrayList;

public class Customer_Catalogue {
	public ArrayList<Customer> CustomerCatalog = new ArrayList<Customer>();
	public Customer _retrieves;

	public Customer retrieveCustomerDetails() {
		return _retrieves;
	}

	public void insert(Customer aCustomer) {
		CustomerCatalog.add(aCustomer);
		System.out.println("Customer succefully added");
	}

	public Customer search(String aName, String aLast_Name, String aType_Of_Car, String aLicense_Plate, String aDate_Of_Accident) {
		System.out.println("Searching for customer in the system...");
		int i; 
		for (i = 0; i < CustomerCatalog.size(); i++) {
			if(CustomerCatalog.get(i).getName().equals(aName) && CustomerCatalog.get(i).getLast_Name().equals(aLast_Name)) {
				return CustomerCatalog.get(i);
			}
		}
		return null;
	}

	public Customer_Catalogue() {
		
	}
}
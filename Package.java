import java.util.Vector;

public class Package {
	private String _code;
	private String _description;
	private String _expiration_Date;
	private double _cost;
	private double _business_Profit;
	public Package_Catalogue _unnamed_Package_Catalogue_;
	public Insurance _sells;
	public Vector<Insurer> _searches = new Vector<Insurer>();
	public Vector<Customer> _purchases = new Vector<Customer>();

	public Insurance retrieveInsuranceDetails() {
		return _sells;
	}

	public Package find() {
		return this;
	}

	public Package retrievePackageDetails() {
		return this;
	}

	public String getCode() {
		return this._code;
	}

	public void setCode(String aCode) {
		this._code = aCode;
	}

	public String getDescription() {
		return this._description;
	}

	public void setDescription(String aDescription) {
		this._description = aDescription;
	}

	public String getExpiration_Date() {
		return this._expiration_Date;
	}

	public void setExpiration_Date(String aExpiration_Date) {
		this._expiration_Date = aExpiration_Date;
	}

	public double getCost() {
		return this._cost;
	}

	public void setCost(double aCost) {
		this._cost = aCost;
	}

	public double getBusiness_Profit() {
		return this._business_Profit;
	}

	public void setBusiness_Profit(double aBusiness_Profit) {
		this._business_Profit = aBusiness_Profit;
	}

	public Package(String aCode, String aDescription, String aExpiration_Date, double aCost, double aBusiness_Profit) {
		_code = aCode;
		_description = aDescription;
		_expiration_Date = aExpiration_Date;
		_cost = aCost;
		_business_Profit = aBusiness_Profit;
		
		System.out.println("New Package succefully created");
	}
	
	public void printData(String Name) {
		int i;
		Customer C;
		for(i = 0; i < _purchases.size();i++) {
			if(_purchases.get(i).getName() == Name) {
				C = _purchases.get(i);
				System.out.println("The Customer " +C.getName()+ " with ID " +C.getID_Number()+ " has the package with code: " +this._code+ " and pays: " +this._cost+ " euros from the company " +_sells.getName());
				break;
			}
		}
	}
}
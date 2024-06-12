import java.util.Vector;

public class Customer {
	private String _name;
	private String _last_Name;
	private String _date_of_Birth;
	private String _prefecture;
	private String _city;
	private int phoneNumber;
	private String _address;
	private int _postal_Code;
	private String _iD_Number;
	public Package _purchases;
	public Customer_Catalogue _unnamed_Customer_Catalogue_;
	public ID_Card _unnamed_ID_Card_;
	public Vector<Vehicle> _owns = new Vector<Vehicle>();
	
	public Customer(String aName, String aLast_Name, String aDate_of_Birth, String aCity, String aPrefecture, int aPostal_Code, String aAddress,int aPhoneNumber, String aIDCardNumber) {
		_name = aName;
		_last_Name = aLast_Name;
		_date_of_Birth = aDate_of_Birth;
		_city = aCity;
		_prefecture = aPrefecture;
		_postal_Code = aPostal_Code;
		_address = aAddress;
		phoneNumber = aPhoneNumber;
		_iD_Number =aIDCardNumber;
		
		System.out.println("New Customer succefully created");
	}

	public Customer getDetails() {
		return this;
	}

	public void insert(String aName, String aLast_Name, String aDate_of_Birth, String aCity, String aPrefecture, int aPostal_Code, String aAddress,int aPhoneNumber, String aIDCardNumber) {
		_name = aName;
		_last_Name = aLast_Name;
		_date_of_Birth = aDate_of_Birth;
		_city = aCity;
		_prefecture = aPrefecture;
		_postal_Code = aPostal_Code;
		_address = aAddress;
		phoneNumber = aPhoneNumber;
		_iD_Number =aIDCardNumber;
		
	}

	public String[] retrieve(String aName, String aLast_Name, String aType_Of_Car, String aLicense_Plate, String aDate_Of_Accident) {
		_name = aName;
		_last_Name = aLast_Name;
		
		String[] returnstring = {_name, _last_Name};
		return returnstring;
		
	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getLast_Name() {
		return this._last_Name;
	}

	public void setLast_Name(String aLast_Name) {
		this._last_Name = aLast_Name;
	}

	public String getDate_of_Birth() {
		return this._date_of_Birth;
	}

	public void setDate_of_Birth(String aDate_of_Birth) {
		this._date_of_Birth = aDate_of_Birth;
	}

	public String getPrefecture() {
		return this._prefecture;
	}

	public void setPrefecture(String aPrefecture) {
		this._prefecture = aPrefecture;
	}

	public String getCity() {
		return this._city;
	}

	public void setCity(String aCity) {
		this._city = aCity;
	}

	public String getAddress() {
		return this._address;
	}

	public void setAddress(String aAddress) {
		this._address = aAddress;
	}

	public int getPostal_Code() {
		return this._postal_Code;
	}

	public void setPostal_Code(int aPostal_Code) {
		this._postal_Code = aPostal_Code;
	}

	public String getID_Number() {
		return this._iD_Number;
	}

	public void setID_Number(String aID_Number) {
		this._iD_Number = aID_Number;
	}
	
	public void printData() {
		System.out.println("Customer Info: " +this._name+ ", " +this._last_Name+ ", " +this._iD_Number);
		
	}
}
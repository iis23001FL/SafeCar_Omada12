import java.util.Vector;

public class Involved_Person extends Customer {
	private String _name;
	private String _last_Name;
	private int _phone_Number;
	private String _iD__Number;
	private String _address;
	private String _city;
	private int _postal_Code;
	private int _address_Number;
	public Vector<Accident> _is_Involed = new Vector<Accident>();

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

	public int getPhone_Number() {
		return this._phone_Number;
	}

	public void setPhone_Number(int aPhone_Number) {
		this._phone_Number = aPhone_Number;
	}

	public String getID__Number() {
		return this._iD__Number;
	}

	public void setID__Number(String aID__Number) {
		this._iD__Number = aID__Number;
	}

	public String getAddress() {
		return this._address;
	}

	public void setAddress(String aAddress) {
		this._address = aAddress;
	}

	public String getCity() {
		return this._city;
	}

	public void setCity(String aCity) {
		this._city = aCity;
	}

	public int getPostal_Code() {
		return this._postal_Code;
	}

	public void setPostal_Code(int aPostal_Code) {
		this._postal_Code = aPostal_Code;
	}

	public int getAddress_Number() {
		return this._address_Number;
	}

	public void setAddress_Number(int aAddress_Number) {
		this._address_Number = aAddress_Number;
	}

	public Involved_Person(String aName, String aLast_Name, int aPhone_Number, String aID_Number, String aAddress, String aCity, int aPostal_Code, int aAddress_Number) {
		super(aName, aLast_Name, null, aCity, null, aPostal_Code, aAddress, aPhone_Number, aID_Number);
		_name = aName;
		_last_Name = aLast_Name;
		_phone_Number = aPhone_Number;
		_iD__Number = aID_Number;
		_address = aAddress;
		_city = aCity;
		_postal_Code = aPostal_Code;
		_address_Number = aAddress_Number;
	}
}
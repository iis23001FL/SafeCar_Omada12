public class Vehicle {
	private String _license_Plate;
	private String _model;
	private double _cubic_Centimeters;
	private String _brand;
	private String _colour;
	private String _type_Of_Car;
	public Customer _owns;
	public Vehicle_Catalogue _retrieves;

	public void insert(String aLicense_Plate, String aBrand, String aModel, double aCubic_Centimeters, String aColour) {
		_license_Plate = aLicense_Plate;
		_brand = aBrand;
		_model = aModel;
		_cubic_Centimeters = aCubic_Centimeters;
		_colour = aColour;
	}
	

	public String getLicense_Plate() {
		return this._license_Plate;
	}

	public void setLicense_Plate(String aLicense_Plate) {
		this._license_Plate = aLicense_Plate;
	}

	public String getModel() {
		return this._model;
	}

	public void setModel(String aModel) {
		this._model = aModel;
	}

	public double getCubic_Centimeters() {
		return this._cubic_Centimeters;
	}

	public void setCubic_Centimeters(double aCubic_Centimeters) {
		this._cubic_Centimeters = aCubic_Centimeters;
	}

	public String getBrand() {
		return this._brand;
	}

	public void setBrand(String aBrand) {
		this._brand = aBrand;
	}

	public String getColour() {
		return this._colour;
	}

	public void setColour(String aColour) {
		this._colour = aColour;
	}

	public String getType_Of_Car() {
		return this._type_Of_Car;
	}

	public void setType_Of_Car(String aType_Of_Car) {
		this._type_Of_Car = aType_Of_Car;
	}

	public Vehicle(String aLicense_Plate, String aBrand, String aModel, double aCubic_Centimeters, String Type_Of_Car ,String aColour) {
		_license_Plate = aLicense_Plate;
		_brand = aBrand;
		_model = aModel;
		_cubic_Centimeters = aCubic_Centimeters;
		_colour = aColour;
		_type_Of_Car = Type_Of_Car;
		
		System.out.println("New Vehicle succefully created");
	}
	
	public void printData() {
		System.out.println("Vehicle Info: " +this._license_Plate+ ", " +this._colour+ ", " +this._cubic_Centimeters);
	}
}
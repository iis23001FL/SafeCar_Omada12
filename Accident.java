import java.util.Vector;

public class Accident{
	private int _day_of_Accident;
	private double _time_of_Accident;
	private int _year_of_Accident;
	private String _country_of_Accident;
	private int _postal_Code_Of_Area_Of_Accident;
	private String _city_of_Accident;
	private String _region_Of_Accident;
	private String _a_prefecture;
	private int _number_Of_People_Involved;
	private String _amount_of_Damage;
	private String _responsibility;
	private Files _photos_of_Accident;
	private Files _experts_Report;
	private Files _incident_Report;
	private boolean _approval;
	private double _compensation_Amount;
	private String _date_Of_Accident;
	public Accident_Catalogue _retrieves;
	public Photograph _contains;
	public Incident_Report _unnamed_Incident_Report_;
	public Vector<Involved_Person> _unnamed_Involved_Person_ = new Vector<Involved_Person>();
	public Expert _writes;

	public void insert(int aNumberOfInvolved) {
		_number_Of_People_Involved = aNumberOfInvolved;
	}

	public void insert(int aDay, double aHour, int aYear, String aCountry, int aPostalCode, String aPrefecture, String aCity, String aRegion) {
		_day_of_Accident = aDay;
		_time_of_Accident = aHour;
		_year_of_Accident = aYear;
		_country_of_Accident = aCountry;
		_postal_Code_Of_Area_Of_Accident = aPostalCode;
		_a_prefecture = aPrefecture;
		_city_of_Accident = aCity;
		_region_Of_Accident = aRegion;
		
	}

	public void insert(String aResponsibility, String aAmount_of_Damage) {
		_responsibility = aResponsibility;
		_amount_of_Damage = aAmount_of_Damage;
	}

	public void insert(Files aPhotograph) {
		_photos_of_Accident = aPhotograph;
	}

	public Agent chooseAgent() {
		return null;
		
	}

	public Accident create() {
		return null;
	
	}

	public void insert(String aName, String aLastName, int aDate_of_Birth, String aCity,  String aPrefecture, int aPostal_Code, String aAddress, int aPhoneNumber, String aIDCardNumber) {
		
	}

	public int getDay_of_Accident() {
		return this._day_of_Accident;
	}

	public void setDay_of_Accident(int aDay_of_Accident) {
		this._day_of_Accident = aDay_of_Accident;
	}

	public double getTime_of_Accident() {
		return this._time_of_Accident;
	}

	public void setTime_of_Accident(double aTime_of_Accident) {
		this._time_of_Accident = aTime_of_Accident;
	}

	public int getYear_of_Accident() {
		return this._year_of_Accident;
	}

	public void setYear_of_Accident(int aYear_of_Accident) {
		this._year_of_Accident = aYear_of_Accident;
	}

	public String getCountry_of_Accident() {
		return this._country_of_Accident;
	}

	public void setCountry_of_Accident(String aCountry_of_Accident) {
		this._country_of_Accident = aCountry_of_Accident;
	}

	public int getPostal_Code_Of_Area_Of_Accident() {
		return this._postal_Code_Of_Area_Of_Accident;
	}

	public void setPostal_Code_Of_Area_Of_Accident(int aPostal_Code_Of_Area_Of_Accident) {
		this._postal_Code_Of_Area_Of_Accident = aPostal_Code_Of_Area_Of_Accident;
	}

	public String getCity_of_Accident() {
		return this._city_of_Accident;
	}

	public void setCity_of_Accident(String aCity_of_Accident) {
		this._city_of_Accident = aCity_of_Accident;
	}

	public String getRegion_Of_Accident() {
		return this._region_Of_Accident;
	}

	public void setRegion_Of_Accident(String aRegion_Of_Accident) {
		this._region_Of_Accident = aRegion_Of_Accident;
	}

	public int getNumber_Of_People_Involved() {
		return this._number_Of_People_Involved;
	}

	public void setNumber_Of_People_Involved(int aNumber_Of_People_Involved) {
		this._number_Of_People_Involved = aNumber_Of_People_Involved;
	}

	public String getAmount_of_Damage() {
		return this._amount_of_Damage;
	}

	public void setAmount_of_Damage(String aAmount_of_Damage) {
		this._amount_of_Damage = aAmount_of_Damage;
	}

	public String getResponsibility() {
		return this._responsibility;
	}

	public void setResponsibility(String aResponsibility) {
		this._responsibility = aResponsibility;
	}

	public Files getPhotos_of_Accident() {
		return this._photos_of_Accident;
	}

	public void setPhotos_of_Accident(Files aPhotos_of_Accident) {
		this._photos_of_Accident = aPhotos_of_Accident;
	}

	public Files getExperts_Report() {
		return this._experts_Report;
	}

	public void setExperts_Report(Files aExperts_Report) {
		this._experts_Report = aExperts_Report;
	}

	public Files getIncident_Report() {
		return this._incident_Report;
	}

	public void setIncident_Report(Files aIncident_Report) {
		this._incident_Report = aIncident_Report;
	}

	public boolean getApproval() {
		return this._approval;
	}

	public void setApproval(boolean aApproval) {
		this._approval = aApproval;
	}

	public double getCompensation_Amount() {
		return this._compensation_Amount;
	}

	public void setCompensation_Amount(double aCompensation_Amount) {
		this._compensation_Amount = aCompensation_Amount;
	}

	public String getDate_Of_Accident() {
		return this._date_Of_Accident;
	}

	public void setDate_Of_Accident(String aDate_Of_Accident) {
		this._date_Of_Accident = aDate_Of_Accident;
	}

	public Accident(int aDay, double aHour, int aYear, String aCountry, int aPostalCode, String aPrefecture, String aCity, String aRegion, int aNumberOfInvolved, String aResponsibility, String aAmount_of_Damage, Files aPhotograph) {
		_day_of_Accident = aDay;
		_time_of_Accident = aHour;
		_year_of_Accident = aYear;
		_country_of_Accident = aCountry;
		_postal_Code_Of_Area_Of_Accident = aPostalCode;
		_a_prefecture = aPrefecture;
		_city_of_Accident = aCity;
		_region_Of_Accident = aRegion;
	}

	public String get_a_prefecture() {
		return _a_prefecture;
	}

	public void set_a_prefecture(String _a_prefecture) {
		this._a_prefecture = _a_prefecture;
	}
}
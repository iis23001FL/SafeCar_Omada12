public class ID_Card {
	private String _iD_Card_Number;
	public ID_Card_Catalogue _retrieves;
	public Customer _has;

	public void insert(String aID_Card) {
		_iD_Card_Number = aID_Card; 
	}

	public void continue_45() {
		
	}

	public String getID_Card_Number() {
		return this._iD_Card_Number;
	}

	public void setID_Card_Number(String aID_Card_Number) {
		this._iD_Card_Number = aID_Card_Number;
	}

	public ID_Card(String aID_Card_Number) {
		_iD_Card_Number = aID_Card_Number;
	}
}
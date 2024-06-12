import java.util.Vector;

public class Files {
	private String _name;
	private String _data;
	private String[] _key_Words;
	public Vector<Administrator> _manages = new Vector<Administrator>();
	public Files_Catalogue _retrieves;
	public Vector<Statistical_Data> _create = new Vector<Statistical_Data>();
	public Data_Base _connects;

	public Files OpenSelectedFileContents() {
		return null;
	}

	public void chooseFileConfirmation() {
	
	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public String getData() {
		return this._data;
	}

	public void setData(String aData) {
		this._data = aData;
	}

	public String[] getKey_Words() {
		return this._key_Words;
	}

	public void setKey_Words(String[] aKey_Words) {
		this._key_Words = aKey_Words;
	}

	public Files(String aName, String aData, String[] aKey_Words) {
		_name = aName;
		_data = aData;
		_key_Words = aKey_Words;
	}
}
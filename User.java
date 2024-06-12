public class User extends Employee {
	private String _specialty;
	private String _name;
	public User_Catalogue _unnamed_User_Catalogue_;
	public User_Rights_Catalogue _unnamed_User_Rights_Catalogue_;

	public String getSpecialty() {
		return this._specialty;
	}

	public void setSpecialty(String aSpecialty) {
		this._specialty = aSpecialty;
	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public boolean[] getUser_Rights() {
		return null;
	}

	public void setUser_Rights(boolean[] aUser_Rights) {
	}

	public User(String aSpecialty, String aName) {
		_specialty = aSpecialty;
		_name = aName;
		
	}
}
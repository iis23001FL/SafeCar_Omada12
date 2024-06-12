import java.util.Vector;

public class Insurance {
	private String _name;
	public Vector<Package> sells = new Vector<Package>();
	public Insurance_Catalogue _retrieves;
	public Vector<Insurance_Policy> _sells = new Vector<Insurance_Policy>();

	public void find() {
	}

	public String getName() {
		return this._name;
	}

	public void setName(String aName) {
		this._name = aName;
	}

	public Insurance(String aName) {
		_name = aName;
		System.out.println("New Insurance Company succefully created");
	}
	
	public void printData() {
		int i;
		System.out.println("The company " +this._name +" sells the following insurance packages:");
		for(i = 0; i < sells.size(); i++) {
			System.out.println("" +sells.get(i).getCode());
		}
		if(sells.size()== 0) {
			System.out.println("-");
		}
	}
}
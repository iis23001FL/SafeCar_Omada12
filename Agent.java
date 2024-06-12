import java.util.Vector;

public class Agent extends Employee {
	private String Name;
	public Vector<Expert> _sends_Files = new Vector<Expert>();
	public Vector<Traffic_Police> _communicate = new Vector<Traffic_Police>();
	public Agent_Catalogue _retrieves;
	public Vector<Insurance_Policy> _recommends = new Vector<Insurance_Policy>();

	public void retrieveNames() {
		
	}

	public Agent(String Name) {
		this.Name = Name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
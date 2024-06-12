import java.util.ArrayList;

public class Insurance_Catalogue {
	public ArrayList<Insurance> InsuranceCatalog = new ArrayList<Insurance>();
	public Insurance _retrieves;

	public Insurance search(String Name) {
		int i; 
		for (i = 0; i < InsuranceCatalog.size(); i++) {
			if(InsuranceCatalog.get(i).getName().equals(Name)) {
				return InsuranceCatalog.get(i);
			}
		}
		return null;
	}

	public Insurance_Catalogue() {
	
	}
}
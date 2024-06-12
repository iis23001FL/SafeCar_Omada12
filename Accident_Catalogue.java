import java.util.ArrayList;

public class Accident_Catalogue {
	public ArrayList<Accident> AccidentCatalog = new ArrayList<Accident>();
	public Accident _unnamed_Accident_;

	public void insert(Accident aAccident) {
		AccidentCatalog.add(aAccident);
	}

	public Accident_Catalogue() {
	}
}
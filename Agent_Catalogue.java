import java.util.ArrayList;

public class Agent_Catalogue {
	public ArrayList<Agent> AgentCatalog = new ArrayList<Agent>();
	public Agent _retrieves;

	public String retrieveNames() {
		int i; 
		for (i = 0; i < AgentCatalog.size(); i++) {
			return AgentCatalog.get(i).getName();
		}
		return null;
	}
	
	public Agent_Catalogue() {
		
	}
}
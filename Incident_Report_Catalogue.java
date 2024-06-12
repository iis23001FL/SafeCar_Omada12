import java.util.ArrayList;

public class Incident_Report_Catalogue {
	public ArrayList<Incident_Report> IncidentReportCatalog = new ArrayList<Incident_Report>();
	public Incident_Report _retrieves;
	
	public Incident_Report_Catalogue(){
		
	}

	public void insert(Incident_Report aIncident_Report) {
		IncidentReportCatalog.add(aIncident_Report);
	}

	public Incident_Report search(Incident_Report aIncident_Report) {
		int i; 
		for (i = 0; i < IncidentReportCatalog.size(); i++) {
			if(IncidentReportCatalog.get(i).equals(aIncident_Report)) {
				return aIncident_Report;
			}
		}
		return null;
	}
}
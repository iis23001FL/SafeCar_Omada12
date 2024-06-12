import java.util.ArrayList;

public class Statistical_Data_Catalogue {
	public ArrayList<Statistical_Data> StatDataCatalog = new ArrayList<Statistical_Data>();
	public Statistical_Data _retrieves;

	public void insertStatisticalData(Statistical_Data StatData) {
		StatDataCatalog.add(StatData);
	}

	public Statistical_Data_Catalogue() {
	}
}
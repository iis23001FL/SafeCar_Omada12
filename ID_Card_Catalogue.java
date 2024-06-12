import java.util.ArrayList;

public class ID_Card_Catalogue {
	public ArrayList<ID_Card> IDCardCatalog = new ArrayList<ID_Card>();
	public ID_Card _retrieves;

	public void insert(ID_Card aID_Card) {
		IDCardCatalog.add(aID_Card);
	}

	public ID_Card_Catalogue() {
		
	}
}
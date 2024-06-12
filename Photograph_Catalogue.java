import java.util.ArrayList;

public class Photograph_Catalogue {
	public ArrayList<Photograph> PhotoCatalog = new ArrayList<Photograph>();
	public Photograph _retrieves;

	public Photograph find(Photograph aPhoto) {
		int i; 
		for (i = 0; i < PhotoCatalog.size(); i++) {
			if(PhotoCatalog.get(i).equals(aPhoto)) {
				return aPhoto;
			}
		}
		return null;
	}

	public Photograph_Catalogue() {
	
	}
}
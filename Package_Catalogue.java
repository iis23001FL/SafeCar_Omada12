import java.util.ArrayList;

public class Package_Catalogue {
	public ArrayList<Package> PackageCatalog = new ArrayList<Package>();
	public Package _retrieves;

	public void getPackageDetails(Package aPackage) {
		int i; 
		for (i = 0; i < PackageCatalog.size(); i++) {
			if(PackageCatalog.get(i).equals(aPackage)) {
				System.out.println("Package Details: Business Profit:" + PackageCatalog.get(i).getBusiness_Profit()+ ", Code:" +PackageCatalog.get(i).getCode()+ ", Description:" +PackageCatalog.get(i).getDescription()+ " ,Cost: " +PackageCatalog.get(i).getCost()+ " and Expiration Date: " +PackageCatalog.get(i).getExpiration_Date());
			}
		}
	}

	public Package search(Package aPackage) {
		int i; 
		for (i = 0; i < PackageCatalog.size(); i++) {
			if(PackageCatalog.get(i).equals(aPackage)) {
				return PackageCatalog.get(i);
			}
		}
		return null;
	}

	public void findPackageDetails(Package aPackage) {
		int i; 
		for (i = 0; i < PackageCatalog.size(); i++) {
			if(PackageCatalog.get(i).equals(aPackage)) {
				System.out.println("Package Details: Business Profit:" + PackageCatalog.get(i).getBusiness_Profit()+ ", Code:" +PackageCatalog.get(i).getCode()+ ", Description:" +PackageCatalog.get(i).getDescription()+ " ,Cost: " +PackageCatalog.get(i).getCost()+ " and Expiration Date: " +PackageCatalog.get(i).getExpiration_Date());
			}
		}
	}

	public Package_Catalogue() {
	}
}
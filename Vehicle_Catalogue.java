import java.util.ArrayList;

public class Vehicle_Catalogue {
	public ArrayList<Vehicle> VehicleCatalog = new ArrayList<Vehicle>();
	public Vehicle _retrieves;

	public void insert(Vehicle aVehicle) {
		VehicleCatalog.add(aVehicle);
		
		System.out.println("Vehicle succefully added");
	}

	public Vehicle_Catalogue() {
	}
}
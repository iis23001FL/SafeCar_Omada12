
public class Main {

	public static void main(String[] args) {
		
		Customer C1 = new Customer("Jake", "Anderson", "1/2/2000", "Thessaloniki", "Thessaloniki", 786237, "Address 1", 6923486, "AA1111");
		Customer C2 = new Customer("Maria", "Papadopoulou", "2/5/2002", "Athens", "Athens", 901742, "Address 2", 6932623, "AA1112");
		
		Customer_Catalogue CC = new Customer_Catalogue();
		
		CC.insert(C1);
		CC.insert(C2);
				
		Vehicle V1 = new Vehicle("APN 645863", "Ford", "AAA", 50, "Small Car", "White");
		Vehicle V2 = new Vehicle("IJK 345779", "Toyota", "BBB", 100, "Jeep", "Black");
		
		Vehicle_Catalogue VC = new Vehicle_Catalogue();
		
		VC.insert(V2);
		VC.insert(V1);
		
		C1._owns.add(V1);
		C2._owns.add(V2);
		
		Customer res1 = CC.search("Jake", "Anderson", "Small Car", "APN 645863", "12/3/2023");
		res1.printData();
		
		Customer res2 = CC.search("Maria", "Papadopoulou", "Jeep", "IJK 345779", "7/5/2024");
		res2.printData();
		
		Package P1 = new Package("P0001", "Normal Package", "31/12/2027", 20, 0.12);
		Package P2 = new Package("P0002", "Expensive Package", "31/6/2029", 100, 0.32);
		Package P3 = new Package("P0003", "Cheap Package", "31/6/2024", 10, 0.04);
		
		C1._purchases = P1;
		C2._purchases = P1;
		C2._purchases = P2;
		
		P1._purchases.add(C1);
		P1._purchases.add(C2);
		P2._purchases.add(C2);
		
		Insurance INS1 = new Insurance("Insurance Company 1");
		Insurance INS2 = new Insurance("Insurance Company 2");
		Insurance INS3 = new Insurance("Insurance Company 3");
		
		INS1.sells.add(P2);
		INS2.sells.add(P1);
		INS2.sells.add(P3);
		
		P1._sells = INS2;
		P2._sells = INS1;
		P3._sells = INS2;
		
		P1.printData("Jake");
		P1.printData("Maria");
		P2.printData("Maria");
		
		INS1.printData();
		INS2.printData();
		INS3.printData();
	}

}

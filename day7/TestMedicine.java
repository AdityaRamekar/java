package day7;

import java.util.Scanner;

abstract class Medicines{
	static String Brand="City Pharmacy";
	static String Name="drug";
	static int Price=500;
	
	
	 void GetDetails() {
		System.out.println("Brand="+Brand);
		System.out.println("Name="+Name);
		System.out.println("Price="+Price);
				
	}
	 void InputData() {
		
		//Medicine.Brand=Brand;
		//Medicine.Name=Name;
		//Medicine.Price=Price;
	 }
	
    abstract void DisplayLabels();
}
class Tablets extends Medicines{

	@Override
	void DisplayLabels() {
		// TODO Auto-generated method stub
		System.out.println("----For Tablet childclass----");
		System.out.println("store in a cool dry place");
	}
	
}
class Syrups extends Medicines{

	@Override
	void DisplayLabels() {
		// TODO Auto-generated method stub
		System.out.println("----For Syrup childclass----");
		System.out.println("Consume within 24 months");
	}
	
}
class Ointments extends Medicines{



	@Override
	void DisplayLabels() {
		// TODO Auto-generated method stub
		System.out.println("----For Ointment childclass----");
		System.out.println("for external use only");
	}
	
}
class MedicineOverride{
	//to override class medicine 
void InputData(String Brand,String Name,int Price) {
		
		Medicines.Brand=Brand;
		Medicines.Name=Name;
		Medicines.Price=Price;

	}
void GetDetails() {
	System.out.println("Brand="+Medicines.Brand);
	System.out.println("Name="+Medicines.Name);
	System.out.println("Price="+Medicines.Price);
			
}
	
}

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablets T= new Tablets();
		Ointments O=new Ointments();
		MedicineOverride M=new MedicineOverride();
		M.GetDetails();
		Syrups S=new Syrups();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand");
		Medicines.Brand=sc.nextLine();
		System.out.println("Enter Name");
		Medicines.Name=sc.nextLine();
		System.out.println("Enter Price");
		Medicines.Price=sc.nextInt();
		M.InputData(Medicines.Brand,Medicines.Name,Medicines.Price);

		
		T.DisplayLabels();

		O.DisplayLabels();
		
		S.DisplayLabels();
		
		System.out.println("UpdatedValues:");
		M.GetDetails();
		
		sc.close();
	}



}

package day7;

import java.util.Scanner;
/*
interface Medicine{
	static String Brand="City Pharmacy";
	static String Name="drug";
	static int Price=500;
	
	
	 void GetDetails();	
	
	 void InputData();
	
     void DisplayLabel();
}
class Tablet implements Medicine{

	@Override
	void DisplayLabel() {
		// TODO Auto-generated method stub
		System.out.println("----For Tablet childclass----");
		System.out.println("store in a cool dry place");
	}
	void GetDetails() {};	
	
	 void InputData() {};
	
}
class Syrup extends Medicine{

	@Override
	void DisplayLabel() {
		// TODO Auto-generated method stub
		System.out.println("----For Syrup childclass----");
		System.out.println("Consume within 24 months");
	}
	
}
class Ointment extends Medicine{

	@Override
	void DisplayLabel() {
		// TODO Auto-generated method stub
		System.out.println("----For Ointment childclass----");
		System.out.println("for external use only");
	}
	
}
class MedicineOverride{
	//to override class medicine 
void InputData(String Brand,String Name,int Price) {
		
		Medicine.Brand=Brand;
		Medicine.Name=Name;
		Medicine.Price=Price;

	}
void GetDetails() {
	System.out.println("Brand="+Medicine.Brand);
	System.out.println("Name="+Medicine.Name);
	System.out.println("Price="+Medicine.Price);
			
}
	
}

public class TestMedicineInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablet T= new Tablet();
		Ointment O=new Ointment();
		MedicineOverride M=new MedicineOverride();
		M.GetDetails();
		Syrup S=new Syrup();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Brand");
		Medicine.Brand=sc.nextLine();
		System.out.println("Enter Name");
		Medicine.Name=sc.nextLine();
		System.out.println("Enter Price");
		Medicine.Price=sc.nextInt();
		M.InputData(Medicine.Brand,Medicine.Name,Medicine.Price);

		
		T.DisplayLabel();

		O.DisplayLabel();
		
		S.DisplayLabel();
		
		System.out.println("UpdatedValues:");
		M.GetDetails();
		
		
		

		sc.close();
	}



}
*/
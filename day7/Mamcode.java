package day7;

import java.util.Scanner;

interface MediInf{
	void getDisplay();
	void displayLabel();
}

abstract class Medicine implements MediInf{
	String name;
	int prize;
	String brand;
	public Medicine(String name, int prize, String brand) {
		super();
		this.name = name;
		this.prize = prize;
		this.brand = brand;
	}
	
	public void getDisplay()
	{
		System.out.println("name="+name+" prize="+prize+" brand="+brand);
	}
	
	
}
class Tablet extends Medicine{

	public Tablet(String name, int prize, String brand) {
		super(name, prize, brand);
		// TODO Auto-generated constructor stub
	}
	
	public void displayLabel()
	{
		System.out.println("keep in cool place");
	}
}

class Syrup extends Medicine{

	public Syrup(String name, int prize, String brand) {
		super(name, prize, brand);
		// TODO Auto-generated constructor stub
	}
	
	public void displayLabel()
	{
		System.out.println("shake before use");
	}
}

class Ointment extends Medicine{

	public Ointment(String name, int prize, String brand) {
		super(name, prize, brand);
		// TODO Auto-generated constructor stub
	}
	
	public void displayLabel()
	{
		System.out.println("for external use only");
	}
}


class ForMedicine{
	void forDetails(MediInf m)
	{
		m.getDisplay();
	}
	
	void forLabel(MediInf m)
	{
		m.displayLabel();
	}
	
	
}


public class Mamcode {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		ForMedicine f= new ForMedicine();
		Medicine m=null;
		char conti='y';
		do{
			System.out.println("enter 1 for tablet, 2 syrup and 3 for Ointment");
			int ch= sc.nextInt();
			String name="";
			int prize;
			String brand="";
			switch(ch)
			{
			case 1: 
				System.out.println("enter name");
				name=sc.next();
				prize= sc.nextInt();
				brand= sc.next();
				m=new Tablet(name, prize, brand);
				f.forDetails(m);
				f.forLabel(m);
				break;	
			case 2: 
				System.out.println("enter name");
				name=sc.next();
				prize= sc.nextInt();
			    brand= sc.next();
				m=new Syrup(name, prize, brand);
				f.forDetails(m);
				f.forLabel(m);
				break;
			case 3: 
				System.out.println("enter name");
				 name=sc.next();
				 prize= sc.nextInt();
				 brand= sc.next();
				m=new Ointment(name, prize, brand);
				f.forDetails(m);
				f.forLabel(m);
				break;
			default:
				System.out.println("wrong input");
					
				}
			System.out.println("do u want to continue y for yes n for no");
		
		conti= sc.next().charAt(0);
		}while(conti=='y' || conti=='Y');
		
		
		sc.close();
	}

}

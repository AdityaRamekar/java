package day9;

import java.util.Scanner;

public class CheckedUncheckedExDemo {
	void getMarks() throws ClassNotFoundException
	{
		String str="hello";
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter marks");
		int marks = sc.nextInt();
		//try{
			
		if(marks<0 || marks>100)
			throw new ClassNotFoundException();
		System.out.println("you have scored marks="+marks);
	//}
	/*	catch(ArithmeticException e)
		{
			System.out.println("marks should be in 1 to 100 range...please enter proper marks");
			throw e;
		}*/
		sc.close();
	}	
		
	
	public static void main(String[] args)throws ClassNotFoundException {
		// TODO Auto-generated method stub
		CheckedUncheckedExDemo d=new CheckedUncheckedExDemo();
		
				//try{
			
		d.getMarks();
		//}
		/*catch(ArithmeticException e)
		{
			System.out.println("enter proper mark");
		}*/
		
	}
}

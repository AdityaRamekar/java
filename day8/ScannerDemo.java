package day8;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("name="+name);
		
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("age="+age);
		
		System.out.println("enter addr");
		sc.nextLine();
		String addr=sc.nextLine();
		System.out.println("name="+addr);
		
		sc.close();
	}

}

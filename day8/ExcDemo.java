package day8;

import java.util.Scanner;

public class ExcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter 2 int");
		try {
			int arr[]= {1,2,4};
			System.out.println("arr of 4"+arr[2]);
		
		int i= sc.nextInt();
		int j =sc.nextInt();
		int z = i/j;
		System.out.println("z="+z);
		}catch(ArithmeticException e)
		{
			System.out.println("j should be greater than 0....please enter proper val");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Use proper index 0 to length-1");
		}
		catch(Exception e)
		{
			System.out.println("in exception catch"+e);
		}
	}

}

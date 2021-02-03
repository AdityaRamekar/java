package day9;

import java.util.Scanner;

class Pojo
{	
	int RightPwd=12345678;
	int UserId;
	int Password;
	
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	public void setPassword(int password) {
		Password = password;
	}
	public void Check() {
		if(RightPwd==Password)//equate Password
		
	System.out.println("welcome");
	   
		else {
		System.out.println("wrong password....try again");		
		
		}
		
	}	
	
}
public class ThrowAssignment1 {
	static int i=1;
	public static void main(String[] args)throws ArithmeticException{
		// TODO Auto-generated method stub
		Pojo p=new Pojo();
		System.out.println("Enter User Id");//Enter UserId 
		Scanner sc=new Scanner(System.in);
		p.UserId=sc.nextInt();
		p.setUserId(p.UserId);
		
	    
		try{
		while(i<=3)
			{		
			System.out.println("Enter Password");
			
			p.Password=sc.nextInt();
			p.setPassword(p.Password);
			p.Check();
			if(p.Password==p.RightPwd)
				break;
			
			i++;
	
			}
	}catch(ArithmeticException e) {
		if(i>3)
		{
			System.out.println("***your account is blocked***");
			
			throw new ArithmeticException(); 
				
			
		}
	}
	finally
		{
		if(p.Password!=p.RightPwd)
			{System.out.println("Entered password incorrectly more than 3 times");
			System.out.println("***your account is blocked***");
			}
		if(p.Password==p.RightPwd)
		System.out.println("ok");
	    }
		sc.close();
			
	}

}


package day9;

public class FinallyDemo {
	void method1()
	{
		try {
			System.out.println("in try of method1");
			int i=120;
			if(i>100)
				throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("in catch of method1");
			
		}finally {
			System.out.println("in finally of method1");
		}
	}
	void method2()
	{
		try {
			System.out.println("in try of method2");
			int i=120;
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("in catch of method1");
			
		}finally {
			System.out.println("in finally of method1");
		}
	}
		void method3()
		{
			try {
				System.out.println("in try of method3");
			
			
			}
			catch(ArithmeticException e)
			{
				System.out.println("in catch of method1");
				
			}finally {
				System.out.println("in finally of method1");
			}
		}
		void method4()
		{
			try {
				System.out.println("in try of method2");
				int i=120;
			if(i>100)
				throw new ArithmeticException();
			}
			finally {
				System.out.println("in finally of method1");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinallyDemo d=new FinallyDemo();
		d.method1();
		d.method2();
		d.method3();
		d.method4();
	}

}

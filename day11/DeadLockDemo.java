package day11;
class A{
	synchronized void method1A(B b)
	
	{
		
		System.out.println("in method1A of A");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println("Exception "+e);
		}
			System.out.println("calling method2B of B");
			
			b.method2B();
			
		}
	synchronized void method2A()
	{
		System.out.println("*****in method2 of A");
	}
}
class B{
	synchronized void method1B(A a)
	{
		System.out.println("*****in method1B of B");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			System.out.println("Exception "+e);
		}
			System.out.println("calling method2A of A");
			
			a.method2A();
		
		
	}
	synchronized void method2B()
	{
		System.out.println("*****in method2 of B");
	}
}



public class DeadLockDemo implements Runnable
{
	
	Thread t;
	A a ;
	B b ;
	public DeadLockDemo(A a , B b)
	{
		this.a=a;
		this.b=b;
		t=new Thread(this,"Second");
		t.start();
	}
	public void run() {
		a.method1A(b);
	}
	public static void main(String[] args)
	{
		A a = new A();
		B b =new B();
		new DeadLockDemo(a,b);
		b.method1B(a);
}
}

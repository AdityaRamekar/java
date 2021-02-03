package day10;
class ExtendsTh1 extends Thread{
	
	public ExtendsTh1(String name) {
		super(name);
		setDaemon(true);
		start();
		
	}
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				System.out.println(getName()+"i="+i);
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entered main");
		ExtendsTh1 th1=new ExtendsTh1("First");
		ExtendsTh1 th2=new ExtendsTh1("First");
		ExtendsTh1 th3=new ExtendsTh1("First");
		
		System.out.println("open door");
		
		System.out.println("is alive for first="+th1.isAlive());
		
		/*try {
			th1.join();
			System.out.println("is alive for first+"+th1.isAlive());
		}
		catch(InterruptedException e) {
		e.printStackTrace();
	}*/
		for(int i=1;i<=5;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName()+"i="+i);
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	System.out.println("Close door");
		}
	}



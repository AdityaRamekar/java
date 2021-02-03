package day10;

class ExtendsTh extends Thread {
	public ExtendsTh(String name) {
		super(name);
	}
public void run() {
	for(int i=1;i<=5;i++)
	{
		try {
			System.out.println("i"+i);
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
}
public class ThreadCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entered main");
		ExtendsTh th=new ExtendsTh("NewTh");
		th.start();
		for(int i=1;i<=5;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName()+"i="+i);
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}



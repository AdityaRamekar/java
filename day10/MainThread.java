package day10;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th= Thread.currentThread();
		System.out.println(th);
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

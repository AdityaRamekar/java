package day10;

class ImplTh implements Runnable{
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName()+"i="+i);
				Thread.sleep(800);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entered main");
		ImplTh th=new ImplTh();
		Thread t= new Thread(th,"NewTh");
		t.start();
		for(int i=1;i<=5;i++)
		{
			try {
				System.out.println(Thread.currentThread().getName()+"i="+i);
				Thread.sleep(800);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
				
	}

}

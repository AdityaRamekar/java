package day10;
class Xyz{
	 void call(String msg)
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(2000);
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
		}
	}
class ThDemo implements Runnable{
	Thread t;
	Xyz x;
	String msg;
	ThDemo(String name,Xyz x,String msg)
	{ 
		this.x=x;
		this.msg=msg;
		t = new Thread(this,name);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (x)
		{
		x.call(msg);
		}
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xyz x = new Xyz();
		ThDemo d1=new ThDemo("first",x,"hi");
		ThDemo d2=new ThDemo("second",x,"hello");
		ThDemo d3=new ThDemo("third",x,"how r u?");
		
		
	}

}

package day11;

class Pizza1{
	int count;
	boolean flag=false;
	synchronized void put(int i)
	{if(flag)
		try {
			
		wait();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		count =i;
		System.out.println("produced pizza no "+i);
		notify();
		flag=true;
		
	}
	synchronized int consume()
	{if(!flag) {
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
		System.out.println("consumed pizza no "+count);
		notify();
		flag=false;
		return  count;
	}
	
}
class Producer1 implements Runnable{
	Thread t;
	Pizza1 p;
	Producer1(String name,Pizza1 p)
	{
		this.p=p;
		t=new Thread(this,name);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			p.put(i);
		}
	}
	
}
class Consumer1 implements Runnable{
	Thread t;
	Pizza1 p;
	Consumer1(String name,Pizza1 p)
	{
		this.p=p;
		t=new Thread(this,name);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			p.consume();
		}
	}
	
}
public class InterThComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza1 p= new Pizza1();
		Producer1 pr = new Producer1("Producer",p);
		Consumer1 c = new Consumer1("Consumer",p);
	}

}



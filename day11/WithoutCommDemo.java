package day11;
class Pizza{
	int count;
	synchronized void put(int i)
	{
		count =i;
		System.out.println("produced pizza no "+i);
		
	}
	synchronized int consume()
	{
		System.out.println("consumed pizza no "+count);
		
		return  count;
	}
	
}
class Producer implements Runnable{
	Thread t;
	Pizza p;
	Producer(String name,Pizza p)
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
class Consumer implements Runnable{
	Thread t;
	Pizza p;
	Consumer(String name,Pizza p)
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
public class WithoutCommDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p= new Pizza();
		Producer pr = new Producer("Producer",p);
		Consumer c = new Consumer("Consumer",p);
	}

}

package day12;

class Demo<T extends Number>{
	T i;
	public T getI() {
		return i;
		
	}
	public void setI(T i) {
		this.i = i;
		
	}
	public Demo(T i)
	{
		super();
		this.i =i;
	}
	@Override
	public String toString() {
		return "Demo [i=" + i + "]";
	}
}

	

public class GenericsDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo<Integer>d = new Demo<>(100);
		System.out.println(d);
		System.out.println("i="+d.getI());

		Demo<Double>d1 = new Demo<>(100.5);
		System.out.println(d1);
		System.out.println("i="+d1.getI());

		Demo<Long> d2 = new Demo<>(100l);
		System.out.println(d2);
		System.out.println("i="+d2.getI());

		Demo<Integer>d3 = new Demo<>(100);
		System.out.println(d3);
		System.out.println("i="+d3.getI());
		
	/*	Demo<String>d3 = new Demo<>(asdf);
		System.out.println(d3);
		System.out.println("i="+d3.getI());
*/	}

}

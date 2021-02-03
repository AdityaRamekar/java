package day6;


public class FinalDemo {
	int i;
	final int j=1;
	final int z;
	FinalDemo(int x)
	{
		z=x;
	}
	void method1(final int paraVar)
	{
		final int localVar=paraVar;
		System.out.println("local is="+localVar+"and z="+z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo d=new FinalDemo(11);
		d.method1(123);
	}

}

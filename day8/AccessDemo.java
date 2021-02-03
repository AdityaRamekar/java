package day8;

public class AccessDemo {

	public void call()
	{
		System.out.println("in call of AccessDemo");
	}
	void xyz()
	{
		call();
	}
}

class DClassChildSamePack extends AccessDemo
{
	void method1()
	{
		call();
	}
}
class DClassNonChildSamePack{
	
	void method1()
	{
		AccessDemo A=new AccessDemo();
		A.call();
	}
}

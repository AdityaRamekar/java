package day7;

interface Inf1{
	void method1();
}
interface Inf2{
	void method2();
}
class PClass{
	void method3()
	{
		System.out.println("in method3 of PClass");
	}
}
class ImplInf1 extends PClass implements Inf1,Inf2{
	public void method1()
	{
		System.out.println("in method1 of ImplInf1");
	}
	public void method2()
	{
		System.out.println("in method2 of ImplInf1");
	}
	public void method3()
	{
		System.out.println("in method3 of ImplInf1");
	}
	}

public class InfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inf1 i;
		Inf2 j;
		//Inf1 i= new Inf1();
		ImplInf1 x =new ImplInf1();
		i=x;
		x.method1();
		j=x;
		j.method2();
	}

}

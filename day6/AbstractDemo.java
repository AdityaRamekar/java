package day6;

abstract class DemoAbs{
	DemoAbs(){
		System.out.println("in con of DemoAbs");
	}
	 void method1()
	 {
		 
	 }
	 void method2()
	 {
		 System.out.println("in method2 from demoAbs");
	 }
	
}
class ChildAbs extends DemoAbs{
	 void method1()
	 {
		 System.out.println("in child abs method1");
	 }
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAbs d = new ChildAbs();
		ChildAbs c=new ChildAbs();
		c.method1();
		//DemoAbs d1 = new DemoAbs();
				
	}

}

package day7;

interface ParentInf{
	void method1();
}
interface SecInf{
	void method3();
}
interface ChildInf extends ParentInf,SecInf{
	 
	void method2();
	
}

class ImplInh implements ChildInf{
	
	public void method1() {
		System.out.println("in method1 of ImplInh");
	}
	public void method2() {
		System.out.println("in method2 of ImplInh");
	}
	public void method3() {
		System.out.println("in method3 of ImplInh ");
	}
	
}
public class InheritInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInf ch=new ImplInh();
		ch.method1();
		ch.method2();
		ch.method3();
	}

}

package day8;
//import day8.*;
public class AccessCall extends AccessDemo{
	
	void method1() {
	
		call();
	}
	

}
class DClassNonChildDPack{
	
	void method1() {
		AccessDemo A=new AccessDemo();
		A.call();
	}
}

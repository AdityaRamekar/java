package day6;

abstract class Box5
{
	int side1;
	int side2;
	//static int counter;
	
	Box5(int side1, int side2)
	{
		this.side1=side1;
		this.side2=side2;
		
	}
	Box5(int side1)
	{
		this.side1=side1;
		this.side2=side2;
	}
	void display()
	{
		System.out.println("side1="+side1+" side2="+side2);
	}
	abstract void calArea();
}
class RectSqBox1 extends Box5
{	
	RectSqBox1(int side1, int side2)
	{
		super(side1,side2);
	}	
	void calArea()
	{
		double area=side1*side2;
		System.out.println("Area of the Rectanglular or Square Box="+area);
	}
}
class Triangle1 extends Box5
{	
	Triangle1(int side1, int side2)
	{
		super(side1,side2);
	}	
	void calArea()
	{
		double area=0.5*side1*side2;
		System.out.println("Area of the Triangular Box="+area);
	}
}
 
	
//	void display()
//	{
//		System.out.println("Length="+this.length+" Width="+this.breadth);
//	}
public class BoxWithAbsDemo
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		RectSqBox1 r= new RectSqBox1(10,20);
		r.calArea();
		r.display();
		RectSqBox1 r1= new RectSqBox1(30,20);
		r1.calArea();
		r1.display();
		//System.out.println("No of baxes="+AreaofRectangle.counter);
		Triangle1 r2= new Triangle1(10,20);
		r2.calArea();
		r2.display();
	}

}
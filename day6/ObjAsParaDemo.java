package day6;

class Box {
	int side1;
	int side2;
	public Box(int side1, int side2)
	{
		super();
		this.side1 = side1;
		this.side2 = side2;
	}
	/*public String toString()
	 * {
	 * String str=" side1="+side1+" side2="side2;
	 * return str;
	 * }
	 */
	 
	@Override
	public String toString() 
	{
		return "Box [side1=" + side1 + ", side2=" + side2 + "]";
	}
	boolean isEqual(Box b1,Box b2)
	{
		if(b1.side1==b2.side1&&b1.side2==b2.side2)
		return true;
		else return false;
	}
	Box add(int i)
	{
		this.side1=side1+i;
		this.side2=side2+i;
		return this;
	}
	
}
public class ObjAsParaDemo{
	
public static void main(String[] args)
{
	Box b=new Box(10,20);
	Box b1=new Box(10,30);
	System.out.println(b);
	b.add(10);
	System.out.println(b);
	if(b.isEqual(b,b1))
	{
		
	}
}
}

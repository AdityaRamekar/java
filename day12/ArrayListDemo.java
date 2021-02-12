package day12;
import java.lang.reflect.Array;
import java.util.*;

//import day13.RollCom;

class Student{
	int rollno;
	String name;
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
}

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(123);
		al.add(343);
		al.add(643);
		al.add(13);
		
		System.out.println("3rd element="+al.get(2));
		Iterator<Integer>i= al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//ArrayList<Integer> al =Collections.synchronizedList(new al())));
		ArrayList<Student> al1=new ArrayList<>();
		al1.add(new Student(1,"Priti"));
		al1.add(new Student(2,"Pritesh"));
		al1.add(new Student(3,"Pritam"));
		al1.add(new Student(4,"Pranol"));
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		/*al1.sort(al1,new RollCom());
		System.out.println("after sorting...");
		//i=i.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
}
}
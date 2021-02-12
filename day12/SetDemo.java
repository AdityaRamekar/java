package day12;

import java.util.*;


public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> al=new TreeSet<>();
		al.add(123);
		al.add(343);
		al.add(643);
		al.add(13);
		al.add(343);
		
	
		Iterator<Integer>i= al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("headset till 343");
		i =al.headSet(343,true).iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		HashSet<String> hs = new HashSet<>();
		hs.add("Java");
		hs.add("Oracle");
		hs.add("Hibernate");
		hs.add("Spring");
		hs.add("Hibernate");
		
		Iterator<String> i1= hs.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		
		
	}

}

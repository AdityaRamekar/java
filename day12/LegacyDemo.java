package day12;

import java.util.*;

public class LegacyDemo {
	
	public static void main(String[] args)
	{
		Vector<Integer> v=new Vector<>();
		
		v.add(100);
		v.add(100);
		v.add(100);
		v.add(100);
		v.add(2,2100);
		
		System.out.println("using for each loop");
		for(Integer z:v)
		{
			System.out.println(z);
			
		}
	
	System.out.println("contains 150"+v.contains(150));
	System.out.println("elements at 4"+v.elementAt(3));
	
	Enumeration<Integer> e=v.elements();
	System.out.println("using enumeration..");
	
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
		
	}
	Object arr[]=v.toArray();
	
	for(Object z:arr)
	{
		System.out.println((Integer)z);
		
	}
	Hashtable<Integer, String> ht = new Hashtable<>();
	ht.put(1,"Mita");
	ht.put(2,"Nita");
	ht.put(3,"Rita");
	ht.put(5,"Sita");
	ht.put(6,"Gita");
	
	Enumeration<Integer> e1=ht.keys();
	while(e1.hasMoreElements())
	{
		Integer key=e1.nextElement();
		String val=ht.get(key);
		System.out.println("key"+key+"val="+val);
			
	}
	
	
	
	
	
	}
}

package day14;

public class StrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String s1 = "ABC";
			String s2 = "BCD";
			
			String s3= "str";
			System.out.println("charAt() 4th position="+s.charAt(4));
			
			int diff=s1.compareTo(s2);
			System.out.println("compare s1 and s2"+diff);
			
			System.out.println("Concat() s1 and s2 ="+s1.concat(s2));
			
			System.out.println("s contains() j?="+s.contains("J"));
			
			System.out.println(" s2 exitsWith() 'E' ?? ="+s2.endsWith("E"));
			
			System.out.println("equalsIgnoreCase() Compares this String to another String, ignoring case considerations."+s1.equalsIgnoreCase(s2));
			
			System.out.println("IndexOf(G)="+s.indexOf("G"));
			
			System.out.println("string s isEmpty()"+s.isEmpty());
			
			System.out.println("length() of s is "+ s.length());
			
			System.out.println("s2 is"+s2);
			
			System.out.println("replacing s2 with 'EFG's2 is  "+ s2.replace(s2,"EFG"));
			
			System.out.println("s3 is "+ s3);
			
			System.out.println("s3 toUpperCase"+s3.toUpperCase());
			
			System.out.println("s1 is "+ s1);
			
			System.out.println("s1 toLowerCase"+s3.toLowerCase());
			
			System.out.println("convert s toCharArray()"+s.toCharArray());
			
			String str1="Hello";
			str1.concat("How r u?");
			System.out.println("before assignment str1="+str1);
			
			str1= str1.concat("how r u?");
			
			System.out.println("after assignment atr1="+str1);
			
			StringBuffer sb= new StringBuffer("Hello");
			
			sb.append("how r u");
			System.out.println("stringbuffer ="+sb);
			
			
			String str2= "hello";
			
			String str3 = new String("hello");
			String str4= "hello";
			
			String str5 = new String("hello");
			
			if(str2==str4)
				System.out.println("same");
			else
				System.out.println("not same");
			
			
			if(str3==str5)
				System.out.println("same");
			else
				System.out.println("not same");
			
	}

}

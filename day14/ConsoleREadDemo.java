package day14;

import java.io.*;

public class ConsoleREadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = new byte[20];
		
		BufferedInputStream b1=null;
		System.out.println("enter name");
		
		
		try {
			b1=new BufferedInputStream(System.in);
			b1.read(b);
			System.out.println(new String(b));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				b1.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}

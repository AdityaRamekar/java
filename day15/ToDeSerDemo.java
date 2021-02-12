package day15;

import java.io.*;
public class ToDeSerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("f:/ToSer.txt");
		FileInputStream fo = null;
		ObjectInputStream o= null;
		try {
			fo = new FileInputStream(f);
			 o = new ObjectInputStream(fo) ;
			
			 Trainer x = (Trainer)o.readObject();
			 //o.writeObject(tr);
			 System.out.println("obj="+x);
		} catch (IOException  | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

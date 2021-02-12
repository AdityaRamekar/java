package day15;

import java.io.*;
public class RandomAccessdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("f:/newfile.txt");
		RandomAccessFile f1=null;
		try {
			f1 = new RandomAccessFile(f, "r");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.print((char)f1.read());
			f1.seek(7);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {	
				f1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}

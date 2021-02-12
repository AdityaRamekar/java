package day14;

import java.io.*;

public class BufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("f:/newfile.txt");
		
		FileInputStream fi = null;
		BufferedInputStream f1=null;
		try {
			fi=new FileInputStream(f);
			 f1 = new BufferedInputStream(fi);
			int i;
			while((i=fi.read())!=-1)
				System.out.print((char)i);
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fi.close();
				f1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}



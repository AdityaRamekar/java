package day14;
import java.io.*;
public class InputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("f:/CreateDatabase.txt");
		
		FileInputStream fi=null;
		
			try {
				fi=new FileInputStream(f);
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
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			

	}

}

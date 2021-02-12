package day14;

import java.io.*;
public class CreateNewFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("f:/file_new.txt");
		
		try {
			if(f.createNewFile())
			{
				System.out.println("created");
			}
			else
				System.out.println("already exists");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

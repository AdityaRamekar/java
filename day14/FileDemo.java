package day14;

import java.io.*;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("f:/");
		
		
		System.out.println("name ="+f.isFile());
		System.out.println("parent ="+f.getParent());
		System.out.println("can read ="+f.canRead());
		System.out.println("can write="+f.canWrite());
		System.out.println("exists="+f.exists());
		System.out.println("is directory="+f.isDirectory());
		System.out.println("is hidden="+f.isHidden());
		System.out.println("is free space="+f.getFreeSpace());
		System.out.println("free lenght="+f.length());
		System.out.println("last modified="+new Date(f.lastModified()));
		
		String arr[] = f.list();
		for(String str:arr)
		{
			System.out.println(str);
		}
	}

}

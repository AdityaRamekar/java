package day15;

import java.io.*;

public class PrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream p = new PrintStream(System.out);
		
		p.print("hello all");
		p.close();
	}

}

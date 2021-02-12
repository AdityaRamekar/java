package day14;

import java.io.*;

public class ConsoleWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("f:/file.txt");
		FileOutputStream fo = null;
		
		BufferedOutputStream fi =null;
			
							 				
				try {
					fo=new FileOutputStream(f,true);
				fi = new BufferedOutputStream(fo);
				String str="hello how r u ...welcome to java learning .. writing ";
				
				fi.write(str.getBytes());
				
				System.out.println("done");
				
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}
				finally{
					try {
						fo.close();
						fi.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  }
                }
              }



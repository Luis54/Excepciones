package Diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Declarativas3 {
	//trabajando con IOException para java pre JDK7
	public static void main(String[] args)  {
		File inFile = new File ("/home/matinal/prueba");
		File outFile = new File("/home/matinal/prueba_back.txt");
		Scanner in =null;
		BufferedWriter out=null;
		try {
			in = new Scanner(inFile);
			out = new BufferedWriter(new PrintWriter(outFile));
			String palabra;
			while(in.hasNext()){
				palabra=in.next();
				System.out.println(palabra.toUpperCase());
				out.write(palabra.toUpperCase());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(in!=null) in.close();
			if(out!=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}
}
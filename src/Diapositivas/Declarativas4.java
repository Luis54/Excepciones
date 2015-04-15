package Diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Declarativas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File ("/home/matinal/prueba");
		File outFile = new File("/home/matinal/prueba_back.txt");
		//jdk 7 o superior
		try (Scanner in = new Scanner(inFile);
				BufferedWriter out = new BufferedWriter(new FileWriter(outFile))){
			String palabra;
			while(in.hasNext()){
				palabra =in.next();
				System.out.println(palabra.toUpperCase());
				out.write(palabra.toUpperCase());
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

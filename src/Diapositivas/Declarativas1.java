package Diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Declarativas1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//vamos a leer fichero de texto y lo mostramos por pantalla 
		//la clase Scanner es la mas adecuada
		File inFile = new File ("/home/matinal/prueba");
		Scanner in = new Scanner(inFile);
		//vamos a escribirlo a un fichero de texto de salido
		//la clase PrintWrite la mas adecuada
		File outFile = new File("/home/matinal/prueba_back.txt");
		BufferedWriter out = new BufferedWriter(new PrintWriter(outFile));
		//leemos palabra a palabra usamos el metodo next()
		String palabra;
		while(in.hasNext()){
			palabra=in.next();
			System.out.println(palabra.toUpperCase());
			out.write(palabra.toUpperCase());
		}
		if(in!=null) in.close();
		if(out!=null)out.close();
		
	}

}

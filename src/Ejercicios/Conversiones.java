package Ejercicios;

import java.util.Scanner;

public class Conversiones {
	public int hexADecimal(String h){
		StringBuilder n = new StringBuilder(h).reverse();
		int suma =0;
		for (int i = 0; i < n.length(); i++) {
			if(n.charAt(i)=='A')
				suma = suma + 10 * (int)Math.pow(16, i);
				else if(n.charAt(i)=='B')
				suma = suma + 11 * (int)Math.pow(16, i);
				else if(n.charAt(i)=='C')
				suma = suma + 12 * (int)Math.pow(16, i);
				else if(n.charAt(i)=='D')
				suma = suma + 13 * (int)Math.pow(16, i);
				else if(n.charAt(i)=='E')
				suma = suma + 14 * (int)Math.pow(16, i);
				else if(n.charAt(i)=='F')
				suma = suma + 15 * (int)Math.pow(16, i);
				else {
					suma = suma + Integer. parseInt("" + n.charAt(i)) * (int) Math. pow(16, i) ;
				} 
		}
		
		return suma;
	}
	public int binarioAoDecimal(String b){
		StringBuilder n2 = new StringBuilder(b).reverse();
		int suma = 0;
		int numero = 1;int numero2 = 2;int numero3 = 4;int numero4 = 8;int numero5 = 16;
		int numero6 = 32;int numero7 = 64;
		for (int i = 0; i < n2.length(); i++) {
			
			suma = Integer.parseInt(""+n2.charAt(i)*numero);
			suma += Integer.parseInt(""+n2.charAt(i)*numero2);
			suma += Integer.parseInt(""+n2.charAt(i)*numero3);
			suma += Integer.parseInt(""+n2.charAt(i)*numero4);
			suma += Integer.parseInt(""+n2.charAt(i)*numero5);
			suma += Integer.parseInt(""+n2.charAt(i)*numero6);
			suma += Integer.parseInt(""+n2.charAt(i)*numero7);
		}
		return suma;
	}
	public static void main(String[] args) {
		Conversiones h = new Conversiones();
		Conversiones b = new Conversiones();
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa un numero Hexadecimal para convertirlo a decimal");
		String numero = in.nextLine().toUpperCase();
		System.out.println("El numero decimal es: "+h.hexADecimal(numero));
		System.out.println("Ingresa un numero binario para convertirlo a decimal");
		String numero2 = in.nextLine();
		System.out.println("El numero decimal es: "+b.binarioAoDecimal(numero2));
	}
}

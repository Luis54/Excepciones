package Ejercicios;

import java.util.Scanner;

public class Conversiones {
	public int hexADecimal(String h) throws ImposibleConversionHexadecimal{
		StringBuilder n = new StringBuilder(h).reverse();
		int suma =0;
		for (int i = 0; i < n.length(); i++) {
				if(Character.isDigit(n.charAt(i)) || n.charAt(i)=='A' || n.charAt(i)=='B' || n.charAt(i)=='C' || n.charAt(i)=='D'|| n.charAt(i)=='E' || n.charAt(i)=='F'){
				if(n.charAt(i)=='A')
				suma = suma + 10 * (int)Math.pow(16, i);
				if(n.charAt(i)=='B')
				suma = suma + 11 * (int)Math.pow(16, i);
				if(n.charAt(i)=='C')
				suma = suma + 12 * (int)Math.pow(16, i);
				if(n.charAt(i)=='D')
				suma = suma + 13 * (int)Math.pow(16, i);
				if(n.charAt(i)=='E')
				suma = suma + 14 * (int)Math.pow(16, i);
				if(n.charAt(i)=='F')
				suma = suma + 15 * (int)Math.pow(16, i);
				if(Character.isDigit(n.charAt(i)))suma = suma + Integer.parseInt("" + n.charAt(i)) * (int) Math. pow(16, i) ;
				}
				else {
					throw new ImposibleConversionHexadecimal();
				}
				
		}
		
		return suma;
	}
	public int binarioAoDecimal(String b) throws ImposibleConversionBinario{
		StringBuilder n2 = new StringBuilder(b).reverse();
		int suma = 0;
		int numero = 2;
		for (int i = 0; i < n2.length(); i++) {
			if(n2.charAt(i)=='0' || n2.charAt(i)=='1') 
			suma+= Integer.parseInt(""+n2.charAt(i))*(int)Math.pow(numero, i);
			else 
				throw new ImposibleConversionBinario();
		}
		return suma;
	}
class ImposibleConversionHexadecimal extends Exception{	
	}
class ImposibleConversionBinario extends Exception{	
	}
}

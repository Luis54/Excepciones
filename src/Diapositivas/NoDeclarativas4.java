package Diapositivas;

import java.util.Scanner;

public class NoDeclarativas4 {
	public static int [] numeros = {0,1,2,3,4,5,6,7,8,9};
	public static Scanner in= new Scanner (System.in);
	public static int posicion;
	public static boolean flag=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(!flag)//not flag
			posicion=getPosicion();//se repite hasta que flag se true
		System.out.println("Poscion del array: "+numeros[posicion]);
		
		in.close();
	}
	public static int getPosicion(){
		System.out.println("Indica posicion del array del 0 al 9");
		posicion = in.nextInt();
		if(posicion < numeros.length)
			flag=true;
		return posicion;
	}

}

package Diapositivas;

import java.util.Scanner;

public class NoDeclarativas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vamos a definir un array  (tiene tamaño fijo)
		//usamos la clase scanner para solicitar una posicion
		int [] numeros = {0,1,2,3,4,5,6,7,8,9};
		Scanner valor = new Scanner(System.in);
		System.out.println("Introduce un numero");
		//vamos a introducir una posicion no existente en el array
		int posicion = valor.nextInt();
		System.out.println("El valor de esa poscion es: "+numeros[posicion]);
		
		//lo que no se debe hacer
		//la excepciones no declarativas no deben convertirse en declarativas
		try{
			posicion=valor.nextInt();
			System.out.println("El valor de esa poscion es: "+numeros[posicion]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Esa posicion no existe");
			e.printStackTrace();
		}
		valor.close();
	}

}

package Diapositivas;

import java.util.Scanner;

public class NoDeclarativas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hacemos programacion segura para evitar lo anterior
		//si intentamos acceder a una posicion que no existe,el programa
		//debe terminar con un codigo de error
		int [] numeros = {0,1,2,3,4,5,6,7,8,9};
		Scanner valor = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int posicion = valor.nextInt();
		//deberiamos hacer una expresion regular para controlar que es un int
		if(posicion >=numeros.length || posicion < 0 ){
			//situacion de excepcion
			System.out.println("Intentando acceder a una posicion inexistente");
			//salimos con un codigo de error 1
			valor.close();
			System.exit(1);
		}
		//desarrollo normal del programa
		System.out.println("La posicion es "+numeros[posicion]);
		valor.close();
	}

}

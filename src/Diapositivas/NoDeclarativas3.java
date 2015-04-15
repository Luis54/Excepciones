package Diapositivas;

import java.util.Scanner;

public class NoDeclarativas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//queremos volver dar la oportunidad de volver introducir la posicion
		int [] numeros = {0,1,2,3,4,5,6,7,8,9};
		Scanner valor = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int posicion = valor.nextInt();
		if(posicion >=numeros.length || posicion < 0 ){
			//volvemos a solicitar la poscion 
			System.out.println("Introduce un numero");
			posicion = valor.nextInt();
			//le damos una segundo oportunidad
			if(posicion >=numeros.length || posicion < 0 ){
				System.out.println("Posicion inexistente");
			System.exit(1);
			
			}else{
				System.out.println("La posicion es "+numeros[posicion]);
				
			}
		}else 
			System.out.println("La posicion es "+numeros[posicion]);
		valor.close();
	}

}

package Ejercicios;

public class Triangulo {
	public static void main(String[] args) {
		try {
			Triangulo uno = new Triangulo(5, 5, 5);
		} catch (IlegalTrianguloExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private int lado1;
	private int lado2;
	private int lado3;
	public Triangulo(int lado1, int lado2, int lado3) throws IlegalTrianguloExcepcion {
		if(lado1>=(lado2+lado3)) throw new IlegalTrianguloExcepcion();
		if(lado2>=(lado1+lado3)) throw new IlegalTrianguloExcepcion();
		if(lado3>=(lado2+lado1)) throw new IlegalTrianguloExcepcion();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
}
class IlegalTrianguloExcepcion extends Exception{
}
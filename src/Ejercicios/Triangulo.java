package Ejercicios;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	public Triangulo(int lado1, int lado2, int lado3) throws IlegalTrianguloExcepcion {
		if(lado1> lado2+lado3 && lado2 >lado1+lado3 && lado3 > lado2+lado1){ 
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	else
		throw new IlegalTrianguloExcepcion();
	}
	public int getLado1() {
		return lado1;
	}
	public void setLado1(int lado1) {
		this.lado1 = lado1;
	}
	public int getLado2() {
		return lado2;
	}
	public void setLado2(int lado2) {
		this.lado2 = lado2;
	}
	public int getLado3() {
		return lado3;
	}
	public void setLado3(int lado3) {
		this.lado3 = lado3;
	}
	public int perimetrosTriangulo(){
		return lado1+lado2+lado3;
	}
}
class IlegalTrianguloExcepcion extends Exception{
}

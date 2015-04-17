package Ejercicios;

public class TestConversion {
	public static void main(String[] args) {
		
	}
}
@SuppressWarnings("Serial")
class BinarioMalFormadoException extends Exception{
}
class Binario{
	private String valor;
	
	public Binario(String valor) throws BinarioMalFormadoException{
		if(esBinario(valor))this.valor=valor;
		else
			throw new BinarioMalFormadoException();
	}
	private boolean esBinario(String valor){
		return valor.matches("[01]+");
	}
}
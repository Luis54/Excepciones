package Diapositivas;

public class EjemploExcepcionPropia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			EcuacionSegundoGrado e = new EcuacionSegundoGrado(-1, 2, 1);
		} catch (NoEcuacionSegundoGradoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//creamos nuestra propia excepcion
class NoEcuacionSegundoGradoExcepcion extends Exception{	
}

//creamos la clase de ecuacion segundo grado
class EcuacionSegundoGrado{
	//No sera ecuacion de segundo grado si a=0
	private int a;
	private int b;
	private int c;
	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @throws NoEcuacionSegundoGradoExcepcion si a = 0
	 * 
	 */
	
	public EcuacionSegundoGrado(int a, int b, int c) throws NoEcuacionSegundoGradoExcepcion {
		if(a==0 || a<0) throw new NoEcuacionSegundoGradoExcepcion();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//resto de metodos
	public double getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "EcuacionSegundoGrado [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
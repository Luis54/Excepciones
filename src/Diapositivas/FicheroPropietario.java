package Diapositivas;

import java.util.ResourceBundle;

public class FicheroPropietario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle configuracion = ResourceBundle.getBundle("configuracion");
		String usuario = configuracion.getString("login");
		String contraseña = configuracion.getString("clave");
		System.out.println("El nombre de usuario es: "+usuario+"y la contraseña es: "+contraseña);
	}

}

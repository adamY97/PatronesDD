package Main;

import Prueba1.Usuario;
import Prueba1.UsuarioBuilder;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario1 = new UsuarioBuilder().build("Adam", "Yacobi", "adam@example.com");
		
		System.out.print(usuario1.toString());
	}
	
	
}
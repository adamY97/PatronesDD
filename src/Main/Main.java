package Main;

import Prueba1.Usuario;
import Prueba1.UsuarioBuilder;
import Singleton.Singleton;
import Singleton.UsuarioSingleton;

public class Main {

	public static void main(String[] args) {
		
//		Usuario usuario1 = new UsuarioBuilder().build("Adam", "Yacobi", "adam@example.com");
//		
//		System.out.print(usuario1.toString());
//		
		
		Singleton singleton = Singleton.getInstance("Adam");
		System.out.println(singleton);
		
		UsuarioSingleton usuario2 = UsuarioSingleton.getUsuarioInstance("Adam", "Yacobi", "adam@example.com");
		System.out.println(usuario2);
	}
	
	
}
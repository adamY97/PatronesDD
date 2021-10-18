package Main;

import Builder.Usuario;
import Builder.UsuarioBuilder;
import Prototype.CamisetaClone;
import Singleton.Singleton;
import Singleton.UsuarioSingleton;

public class Main {

	public static void main(String[] args) {
		
		Usuario usuario1 = new UsuarioBuilder().build("Adam", "Yacobi", "adam@example.com");
		
		System.out.print(usuario1.toString());
		System.out.println("");
		
		Singleton singleton = Singleton.getInstance("Adam");
		System.out.println(singleton);
		
		UsuarioSingleton usuario2 = UsuarioSingleton.getUsuarioInstance("Adam", "Yacobi", "adam@example.com");
		System.out.println(usuario2);
		
		
		CamisetaClone camiseta = new CamisetaClone("Camiseta Kenzo", "L", "Negra", "Algodón");
		CamisetaClone camiseta2 = camiseta.clone();
		CamisetaClone camiseta3 = camiseta.clone();
		CamisetaClone camiseta4 = camiseta.clone();
		CamisetaClone camiseta5 = camiseta.clone();
	}
	
	
}
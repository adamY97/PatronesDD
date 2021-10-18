package Singleton;

public class Singleton {
	private String nombre;
	private static Singleton singleton;
	
	private Singleton (String nombre) {
		this.nombre = nombre;
	}

	public static Singleton getInstance(String nombre) {
		if (singleton == null) {
			singleton = new Singleton(nombre);
		} else {
			return null;
		}
		
		return singleton;
	}
	
}
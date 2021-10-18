package Builder;

public class Usuario {

	private String nombre;
	private String apellidos;
	private String email;
	
	
	Usuario (String nombre, String apellidos, String email) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Nombre:"+this.nombre+" "+"Apellidos:"+this.apellidos+" "+"Email:"+this.email;
	}
}

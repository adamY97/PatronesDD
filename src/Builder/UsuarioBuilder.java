package Builder;

public class UsuarioBuilder {

	
	public Usuario build(String nombre, String apellidos, String email) {
		
		Usuario usuario = new Usuario(nombre, apellidos, email);
		
		return usuario;
	}
}

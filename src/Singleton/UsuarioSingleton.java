package Singleton;

public class UsuarioSingleton {
	
	private String nombre;
	private String apellidos;
	private String email;
	private static UsuarioSingleton usuarioS;
	
	
	public static UsuarioSingleton getUsuarioInstance(String nombre, String apellidos, String email) {
		if(usuarioS == null) {
			
			usuarioS = new UsuarioSingleton();
			usuarioS.setNombre(nombre);
			usuarioS.setEmail(apellidos);
			usuarioS.setEmail(email);
			
			}
			
		else
			System.out.println("No se puede crear" + nombre);
		
		return usuarioS;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	

	@Override
	public String toString() {
		return "UsuarioSingleton [nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + "]";
	}

}

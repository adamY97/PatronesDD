package Prototype;

public class CamisetaClone extends Camiseta{

	public CamisetaClone(String nombre, String talla, String color, String material) {
		super(nombre, talla, color, material);
		// TODO Auto-generated constructor stub
	}

	public CamisetaClone clone() {
		
		return new CamisetaClone(super.nombre,super.talla,super.color,super.material);
	}
}

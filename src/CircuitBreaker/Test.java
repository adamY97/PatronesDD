package CircuitBreaker;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Genero 5 coches con valores aleatorios, si el nivel de combustible es mayor a 0 y mayor o igual al minimo de la reserva(3%) y el 
//		aceite mayor a 0 y mayor o igual al minimo necesario(5%) y la bateria funciona, su estado es "OPEN".
//		Si el aceite o el combustible estan por debajo de sus minimos, su estado será "HALF_OPEN". Si alguno de ellos fuera 0 su estado será "DISABLE".
//		Si la bateria no funcionara(false) su estado estará en "CLOSED"

		CircuitoCoche prueba = new CircuitoCoche();
		
		for(int i = 0; i < 5; i++) {
			
			Coche cocheAleatorio = new Coche();
			
			System.out.println(cocheAleatorio.toString());
			
			System.out.println(prueba.CircuitBreaker(cocheAleatorio));
		}
	}

}

package Retry;

public class Test {

	public static void main(String[] args) {
		
		PlayStationServer conexion1 = new PlayStationServer();
		
		System.out.println(conexion1.Retry(5));

	}

}

package Retry;

public class PlayStationServer {
	
	
	private enum puerta {abierta, cerrada};
	private puerta estado = puerta.cerrada;
	private int valor = 0;
	private String msg ="";
	
	//Se introduce un número y se hacen pruebas con el servidor, cuando el atributo valor sea 10 establece conexión y se abriria la "puerta del videojuego".
	
	public String Retry(int num) {
		
		this.valor = valor + num;
		
		 for(int i = 0; i <= 5; i++) {
			 
			 if(valor == 10) {
				 
				 this.estado = puerta.abierta;
				 break;
			 }
			 
			 valor++;
			 
		 }
		 
		 if(this.estado == puerta.abierta) {
			 
			 this.msg = "La conexión ha sido realizada con éxito, puerta abierta.";
		 }else {
			 this.msg = "Conexión fallida, puerta cerrada.";
		 }
		 
		return msg;
	}
	

}

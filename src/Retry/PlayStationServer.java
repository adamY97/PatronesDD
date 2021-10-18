package Retry;

public class PlayStationServer {
	
	
	private enum puerta {abierta, cerrada};
	private puerta estado = puerta.cerrada;
	private int valor = 0;
	private String msg ="";
	
	//Se introduce un n�mero y se hacen pruebas con el servidor, cuando el atributo valor sea 10 establece conexi�n y se abriria la "puerta del videojuego".
	
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
			 
			 this.msg = "La conexi�n ha sido realizada con �xito, puerta abierta.";
		 }else {
			 this.msg = "La conexi�n fallida, puerta cerrada.";
		 }
		 
		return msg;
	}
	

}

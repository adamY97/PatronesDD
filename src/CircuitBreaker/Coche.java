package CircuitBreaker;

import java.util.Random;

public class Coche {

	private int combustible;
	private int aceite;
	private boolean bateria;
	
	public Coche () {
		
		Random r = new Random(); 
		
		this.combustible =  (int)(Math.random()*10+0);
		this.aceite =(int)(Math.random()*10+0);
		this.bateria = r.nextBoolean();
	}

	@Override
	public String toString() {
		return "Coche [combustible=" + combustible + ", aceite=" + aceite + ", bateria=" + bateria + "]";
	}

	public int getCombustible() {
		return combustible;
	}

	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}

	public int getAceite() {
		return aceite;
	}

	public void setAceite(int aceite) {
		this.aceite = aceite;
	}

	public boolean isBateria() {
		return bateria;
	}

	public void setBateria(boolean bateria) {
		this.bateria = bateria;
	}
	
	
}

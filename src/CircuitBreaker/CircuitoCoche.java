package CircuitBreaker;

public class CircuitoCoche {
	
	private final int minAceite = 5;
	private final int minCombustible = 3;
	private String status;

	
	public String CircuitBreaker(Coche coche) {
		
		
		if(coche.getCombustible() > 0 && coche.getAceite() > 0) {
			
			if(coche.isBateria()) {
				
				if(coche.getCombustible() >= this.minCombustible && coche.getAceite() >= this.minAceite) {				 
					
						 this.status = "OPEN";
						 
				}else {
						 
						 this.status = "HALF_OPEN";
				}
					 
			}else {
				
				this.status = "CLOSED";
			}
			
			
		}else {
			
			this.status = "DISABLE";
		}
		
		return this.status;
	}
}

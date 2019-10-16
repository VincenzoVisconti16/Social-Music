
public class main {
	
	public static void main(String[] args) {
		
		
		Uomo Alessandro = new Uomo("Alessandro", "Corsico" , 72, 169, 23);
		PesoIdeale pid = new PesoIdeale ();
		
	    double peso = pid.pesoID(Alessandro.getAltezza(), Alessandro.getEta());
		 
		if( Alessandro.getPeso()- peso < 5  &&  Alessandro.getPeso() - peso > -5)  {
			System.out.println("sei in forma!");
		}
		else if(Alessandro.getPeso() - peso < -5) {
			System.out.println("devi prendere peso!");
		}
		else  {
			System.out.println("devi perdere peso!");
		}
	}

}

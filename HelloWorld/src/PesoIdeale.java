
public class PesoIdeale {
	
	//----attributi----//
	
	//----costruttore----//
	
	public PesoIdeale()   {
		
	}
	
	
	/*Peso ideale = Altezza in cm - 100 + età/10 x 0,9*/
	
	public double pesoID(int alt, int eta) {
		
		return alt - 100 + eta/10 * 0.9;
	}

}

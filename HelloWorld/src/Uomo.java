
public class Uomo {
	
	//----ATTRIBUTI----//
	
	private int peso,altezza,eta;
	private String nome,cognome;
	
	
	
	//----COSTRUTTORE----//

	
	public Uomo(String nome,String cognome, int peso, int altezza, int eta) {
		
		this.nome=nome;
		this.cognome=cognome;
		this.peso=peso;
		this.altezza=altezza;
		this.eta=eta;
		
	}
	
	
	//----OPERAZIONI----//
	
	public int getPeso() {
		
		return peso;
	}
	
	public void setPeso(int peso) {
		
		this.peso = peso;
	}
	
	public int getAltezza() {
		
		return altezza;
	}
	
	public void setAltezza(int altezza) {
	
		this.altezza = altezza;
	}
	
	public int getEta() {
		
		return eta;
	}
	
	public void setEta(int eta) {
		
		this.eta = eta;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getCognome() {
		
		return cognome;
	}
	
	public void setCognome(String cognome) {
		
		this.cognome = cognome;
	}

}

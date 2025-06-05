package ereditarietà;

public class Camion extends Veicolo {
	private boolean cassoneRibaltaBile;

	public Camion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camion(String marca, String modello, String targa, boolean assicurazione, boolean cassoneRibaltaBile) {
		super(marca, modello, targa, assicurazione);
		// TODO Auto-generated constructor stub
	}

	public Camion(boolean cassoneRibaltaBile) {
		super();
		this.cassoneRibaltaBile = cassoneRibaltaBile;
	}

	public boolean isCassoneRibaltaBile() {
		return cassoneRibaltaBile;
	}

	public void setCassoneRibaltaBile(boolean cassoneRibaltaBile) {
		this.cassoneRibaltaBile = cassoneRibaltaBile;
	}
	
	public String toString() {
		return "Camion:\n" + super.toString() + "\ncassoneRibaltabile: " + cassoneRibaltaBile;

	}
	
	

}

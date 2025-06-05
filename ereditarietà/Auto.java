package ereditarietà;

public class Auto extends Veicolo {
	private boolean roulotte;

	public Auto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auto(String marca, String modello, String targa, boolean assicurazione) {
		super(marca, modello, targa, assicurazione);
		// TODO Auto-generated constructor stub
	}

	public boolean isRoulotte() {
		return roulotte;
	}

	public void setRoulotte(boolean roulotte) {
		this.roulotte = roulotte;
	}
	
	public String toString() {
		return "Automobili:\n" + super.toString() + "\nroulotte: " + roulotte;
	}
	

}

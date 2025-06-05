package ereditarietà;

public class Elettrica extends Auto {
	
	

	private int autonomiaKM;
	private boolean batteriaAlLitio;
	
	public Elettrica() {
		super();
	}

	public Elettrica(String marca, String modello, String targa, boolean assicurazione) {
		super(marca, modello, targa, assicurazione);
		// TODO Auto-generated constructor stub
	}
	

	public int getAutonomiaKM() {
		return autonomiaKM;
	}

	public void setAutonomiaKM(int autonomiaKM) {
		this.autonomiaKM = autonomiaKM;
	}
	
	
	public boolean isBatteriaAlLitio() {
		return batteriaAlLitio;
	}

	public void setBatteriaAlLitio(boolean batteriaAlLitio) {
		this.batteriaAlLitio = batteriaAlLitio;
	}

	public String toString() {
		return "Elettrica:\n" + super.toString() + "\nautonomia: " + autonomiaKM + " km";

		
	}
	
	
	

}

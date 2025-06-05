package ereditarietà;

public class Motocicletta extends Veicolo {
	private boolean sidecar;

	public Motocicletta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motocicletta(String marca, String modello, String targa, boolean assicurazione, boolean sidecar) {
		super(marca, modello, targa, assicurazione);
		// TODO Auto-generated constructor stub
	}

	public Motocicletta(boolean sidecar) {
		super();
		this.sidecar = sidecar;
	}

	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}
	
	public String toString() {
		return "Motocicletta\n "+ super.toString() + "\nSidecar = " + sidecar;
	}
	

}

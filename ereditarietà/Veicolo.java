package ereditarietà;

public class Veicolo {

	private String marca;
	private String modello;
	private String targa;
	private boolean assicurazione;

	public Veicolo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veicolo(String marca, String modello, String targa, boolean assicurazione) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.assicurazione = assicurazione;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public boolean isAssicurazione() {
		return assicurazione;
	}

	public void setAssicurazione(boolean assicurazione) {
		this.assicurazione = assicurazione;
	}
	@Override
	public String toString() {
		return "marca: " + marca + "\nmodello: " + modello + "\ntarga: " + targa + "\nassicurazione: "	+ assicurazione;
		}
	
	
}

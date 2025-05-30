package bicicletta;

public class Bicicletta {
	private String marca;
	private String modello;
	private int marcia;
	private double velocità;
	private double kmPercorsi;
	
	
	public Bicicletta(){
		this.marca = "";
		this.modello = "";
		this.marcia = 1;
		this.velocità = 10.0;
		this.kmPercorsi = 0.0;
		
		
	}
	public Bicicletta(String marca, String modello, int marcia, double velocità, double kmPercorsi) {
		this.marca = marca;
		this.modello = modello;
		this.marcia = marcia;
		this.velocità = velocità;
		this.kmPercorsi = 0.0;
		
	}
	
	public String getMarca() {
		return this.marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModello() {
		return this.modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public int getMarcia() {
		return this.marcia;
	}
	public void setMarcia(int marcia) {
		this.marcia = marcia;
	}

	public double getVelocità() {
		return this.velocità;
	}
	public void setVelocità(double marca) {
		this.velocità = velocità;
	}
	public double getkmPercorsi() {
		return this.kmPercorsi;
	}
	public void setkmPercorsi(double kmPercorsi) {
		this.kmPercorsi = kmPercorsi;
	}
	
	public void pedala (double tempo) {
		double kmFatti = velocità * tempo;
		this.kmPercorsi += kmFatti;
	}
	
	public String toString() {
		return "Marca: " + marca + "\nModello: " + modello + "\nMarcia: " + marcia +
	               "\nVelocità: " + velocità + " km/h\nKm percorsi: " + kmPercorsi;

	}



}

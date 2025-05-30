package car;

import java.util.Scanner;

public class Car {
	private String targa;
	private String marca;
	private String modello;
	private double fuel;
	private double consumoMedio;
	private double autonomia;

	public Car() { // Costruttore di default
		super();
	}

	public Car(String targa, String marca, String modello, double fuel, double consumoMedio) {
		super();
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.fuel = fuel;
		this.consumoMedio = consumoMedio;
		

		// Costruttore parametrico
	}

	public String getTarga() {
		return this.targa;

	}

	public void setTarga(String targa) {
		this.targa = targa;
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

	public double getFuel() {
		return this.fuel;

	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public double getConsumomedio() {
		return this.consumoMedio;

	}

	public void setConsumomedio(double consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

	

	public double autonomia() {
		if (this.consumoMedio == 0) {
			return 0;
		}
		return this.fuel / this.consumoMedio;
	}

	public String toString() {
		return "Targa: " + this.targa + "\n" + "Marca: " + this.marca + "\n" + "Modello: " + this.modello + "\n"
				+ "Carburante: " + this.fuel + "\n" + "Consumo medio: " + this.consumoMedio + "\n" + "Autonomia: "
				+ this.autonomia;
	/*
	 * public static void main(String[] args) { Scanner input = new
	 * Scanner(System.in); Car panda = new Car(); Car ferrari = new Car
	 * ("23999","Ferrari","F-40",100.0, 1 ); Car bmw = new Car
	 * ("42312","BMW","M3 Competition",90.0,1); Car mercedes = new Car ()
	 * 
	 * 
	 * }
	 */
}}

package day_06;

public class Dipendente {
	private String nome;
	private double stipendio;

	public Dipendente() {
		nome = "Sconosciuto";
		stipendio = 0.0;
	}

	public Dipendente(String n, double d) {
		this.nome = n;
		this.stipendio = d;
	}

	public String getNome() {
		return nome;
	}

	public double getStipendio() {
		return stipendio;
	}
}

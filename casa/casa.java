package casa;

public class casa {
	private String indirizzo;
	private int numeroStanze;
	private double superficie;
	private double consumoPerMq;
	private double consumoTotale;

	public casa() {
		this.indirizzo = "";
		this.numeroStanze = 0;
		this.superficie = 0;
		this.consumoPerMq = 0;
		this.consumoTotale = 0;
	}

	public casa(String indirizzo, int numeroStanze, double superficie, double consumoPerMq) {
		this.indirizzo = indirizzo;
		this.numeroStanze = numeroStanze;
		this.superficie = superficie;
		this.consumoPerMq = consumoPerMq;
		this.consumoTotale = calcolaConsumoTotale();
	}

	public String getIndirizzo() {
		return this.indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getStanze() {
		return this.numeroStanze;
	}

	public void setStanze(int numeroStanze) {
		this.numeroStanze = numeroStanze;
	}

	public double getSuperficie() {
		return this.superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getConsumo() {
		return this.consumoPerMq;
	}

	public void setConsumo(double consumoPerMq) {
		this.consumoPerMq = consumoPerMq;
	}

	public String efficienzaEnergetica() {
		if (consumoPerMq <= 30) {
			return "A";
		} else if (consumoPerMq <= 50) {
			return "B";
		} else if (consumoPerMq <= 70) {
			return "C";
		} else if (consumoPerMq <= 90) {
			return "D";
		} else if (consumoPerMq <= 110) {
			return "E";
		} else if (consumoPerMq <= 130) {
			return "F";
		} else {
			return "G";
		}

	}

	public double calcolaConsumoTotale() {
		this.consumoTotale = superficie * consumoPerMq;
		return this.consumoTotale;

	}

	public String toString() {
		return "🏠 Casa in " + indirizzo + "\n- Stanze: " + numeroStanze + "\n- Superficie: " + superficie + " mq"
				+ "\n- Consumo per mq: " + consumoPerMq + " kWh" + "\n- Consumo totale: " + consumoTotale + " kWh"
				+ "\n- Efficienza energetica: " + efficienzaEnergetica();

		// TODO Auto-generated method stub

	}

}

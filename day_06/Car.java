package day_06;

// Classe che rappresenta un'automobile
public class Car {
	// Proprietà: resa in km per litro (es. 15 km con 1 litro)
	private double resaKmPerLitro;

	// Quantità attuale di carburante nel serbatoio
	private double carburante;

	// Costruttore: inizializza la resa e imposta il carburante iniziale a 0
	public Car(double resaKmPerLitro) {
		this.resaKmPerLitro = resaKmPerLitro;
		this.carburante = 0;
	}

	// Metodo per simulare la guida di una certa distanza in km
	public void drive(double distanzaKm) {
		// Calcolo dei litri necessari per percorrere la distanza
		double litriNecessari = distanzaKm / resaKmPerLitro;

		// Controllo se c'è abbastanza carburante
		if (carburante >= litriNecessari) {
			// Se sì, sottraggo i litri consumati e stampo conferma
			carburante -= litriNecessari;
			System.out.println("Hai percorso " + distanzaKm + " km.");
		} else {
			// Altrimenti, stampo messaggio di carburante insufficiente
			System.out.println("Carburante insufficiente per percorrere " + distanzaKm + " km.");
		}
	}

	// Metodo per aggiungere carburante al serbatoio
	public void addGas(double litri) {
		carburante += litri;
		System.out.println("Aggiunti " + litri + " litri di carburante");
	}

	// Metodo per ottenere la quantità attuale di carburante
	public double getGas() {
		return carburante;
	}

	// Metodo principale per testare la classe Car
	public static void main(String[] args) {
		// Creo un'istanza di Car con resa di 15 km/litro
		Car miaAuto = new Car(15.0);

		// Aggiungo 10 litri di carburante
		miaAuto.addGas(10);
		System.out.println("Carburante attuale: " + miaAuto.getGas() + " litri.");

		// Simulo un percorso di 100 km
		miaAuto.drive(100);
		System.out.println("Carburante attuale: " + miaAuto.getGas() + " litri.");
	}
}

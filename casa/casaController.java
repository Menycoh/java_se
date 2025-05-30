package casa;

public class casaController {
	public static void aggiornaConsumo(casa casa, double nuovoConsumoPerMq) {
		casa.setConsumo(nuovoConsumoPerMq);
		casa.calcolaConsumoTotale();
	}

}

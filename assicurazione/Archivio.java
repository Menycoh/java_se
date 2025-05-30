package assicurazione;

import java.time.LocalDate;

public class Archivio {

	public static void main(String[] args) {
		// Creazione oggetti cliente
		cliente mario = new cliente("DJISN23NHBASH2346", "Mario", "Rossi", LocalDate.of(2004, 9, 12));
		cliente rosario = new cliente(null, null, null, LocalDate.of(2003, 9, 12));

		rosario.setCodiceFiscale("DNABZJLO12351SDZGJ");
		rosario.setCognome("Puzzoni");
		rosario.setNome("Rosario");

		veicolo autoMario = new veicolo("ABCD123", mario);
		veicolo autoRosario = new veicolo("EFGH456", rosario);

		// System.out.println(autoMario);

		mario.setNome("Mario (Aggiornato)");

		System.out.println(autoMario);
		System.out.println(autoRosario);
	}
}

package day_06;

import java.util.Scanner; // Importazione per poter leggere input da tastiera

public class DiamondKata {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Creo lo scanner per input da tastiera

		System.out.println("Inserisci una lettera maiuscola (da A a Z): ");
		// Leggo il primo carattere inserito, lo converto in maiuscolo, e lo prendo come
		// char
		char lettera = input.next().toUpperCase().charAt(0);

		System.out.println("Hai inserito: " + lettera);
		input.close(); // Chiudo lo scanner per buona pratica

		// Calcolo la distanza della lettera inserita rispetto alla A
		// Es: 'C' - 'A' = 2 -> serviranno 2 lettere sopra e 2 sotto la riga centrale
		int distanza = lettera - 'A';

		// L'altezza (e larghezza) del diamante sarà sempre distanza * 2 + 1
		// Es: distanza = 2 → altezza = 5 (A, B, C, B, A)
		int dimensione = distanza * 2 + 1;

		System.out.println("La lettera è distante " + distanza + " da A");
		System.out.println("Il diamante sarà alto e largo " + dimensione + " righe");

		// ✅ PARTE SUPERIORE DEL DIAMANTE (inclusa la riga centrale)
		for (int i = 0; i <= distanza; i++) {
			// Calcolo la lettera corrente (es: 'A' + 2 = 'C')
			char c = (char) ('A' + i);
			// Calcolo quanti spazi mettere a sinistra e destra per centrare la lettera
			int spaziEsterni = distanza - i;

			// Costruttore di stringa efficiente: StringBuilder
			StringBuilder riga = new StringBuilder();

			// Aggiungo spazi esterni per centrare
			riga.append(" ".repeat(spaziEsterni));
			// Aggiungo la lettera
			riga.append(c);

			// Se non siamo sulla prima riga (che ha solo 1 lettera), aggiungo spazi interni
			// + altra lettera
			if (i > 0) {
				int spaziInterni = i * 2 - 1; // cresce come 1, 3, 5, ...
				riga.append(" ".repeat(spaziInterni));
				riga.append(c); // seconda lettera speculare
			}

			// Aggiungo ancora spazi (non obbligatori, solo simmetrici)
			riga.append(" ".repeat(spaziEsterni));

			// Stampo la riga
			System.out.println(riga.toString());
		}

		// 🔁 PARTE INFERIORE DEL DIAMANTE (esclude la riga centrale)
		for (int i = distanza - 1; i >= 0; i--) {
			char c = (char) ('A' + i);
			int spaziEsterni = distanza - i;

			StringBuilder riga = new StringBuilder();
			riga.append(" ".repeat(spaziEsterni));
			riga.append(c);

			if (i > 0) {
				int spaziInterni = i * 2 - 1;
				riga.append(" ".repeat(spaziInterni));
				riga.append(c);
			}
			riga.append(" ".repeat(spaziEsterni));

			System.out.println(riga.toString());
		}
	}
}

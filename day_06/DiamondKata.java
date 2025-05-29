package day_06;

import java.util.Scanner;

public class DiamondKata {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci una lettera maiuscola (da A a Z): ");
		char lettera = input.next().toUpperCase().charAt(0);

		System.out.println("Hai inserito: " + lettera);
		input.close();
		int distanza = lettera - 'A';
		int dimensione = distanza * 2 + 1;

		System.out.println("La lettera è distante " + distanza + " da A");
		System.out.println("Il diamante sarà alto e largo " + dimensione + "righe");

		for (int i = 0; i <= distanza; i++) {
			char c = (char) ('A' + i);
			int spaziEsterni = distanza - i;

			// Costruzione riga
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

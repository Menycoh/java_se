package day_06;

import java.util.Scanner;

public class GestoreDipendenti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Quanti dipendenti vuoi assumere?");
		int n = input.nextInt();
		input.nextLine(); // Consuma il newline rimasto

		// Crea un array di Dipendenti
		Dipendente[] elencoDipendenti = new Dipendente[n];

		for (int i = 0; i < elencoDipendenti.length; i++) {
			System.out.println("Inserisci il nome del dipendente:");
			String nome = input.nextLine();

			System.out.println("Inserisci lo stipendio del dipendente:");
			double stipendio = input.nextDouble();
			input.nextLine(); // Pulisce il buffer

			// Crea il dipendente e lo mette nell'array
			elencoDipendenti[i] = new Dipendente(nome, stipendio);
		}

		// Stampa i dati dei dipendenti
		System.out.println("\nLista dipendenti:");
		for (int i = 0; i < elencoDipendenti.length; i++) {
			System.out.println("Dipendente #" + (i + 1));
			System.out.println("Nome: " + elencoDipendenti[i].getNome());
			System.out.println("Stipendio: " + elencoDipendenti[i].getStipendio());
			System.out.println();
		}

		input.close();
	}
}
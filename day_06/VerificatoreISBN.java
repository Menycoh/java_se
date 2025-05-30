package day_06;

import java.util.Scanner;

public class VerificatoreISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Richiesta all'utente del codice ISBN
		System.out.println("Inserisci un codice ISBN-10 (con o senza trattini)");
		String isbn = input.nextLine();

		// Pulizia della stringa: rimuove spazi e trattini, e converte in maiuscolo
		isbn = isbn.replaceAll(" ", "");
		isbn = isbn.toUpperCase();
		isbn = isbn.replaceAll("-", "");

		// Controllo che la lunghezza sia esattamente 10 caratteri
		if (isbn.length() != 10) {
			System.out.println("Il codice deve avere assolutamente 10 caratteri (esclusi i trattini)!");
			return;
		}

		int somma = 0; // inizializzo la somma per il calcolo finale

		// Ciclo su ciascun carattere del codice
		for (int i = 0; i < 10; i++) {
			char c = isbn.charAt(i); // prendo il carattere in posizione i
			int valore;

			// Se siamo all'ultimo carattere e c'è una 'X', vale 10
			if (i == 9 && c == 'X') {
				valore = 10;

				// Altrimenti, se è una cifra da 0 a 9, la converto in numero
			} else if (Character.isDigit(c)) {
				valore = Character.getNumericValue(c);

				// Se non è né cifra né 'X', è un carattere non valido
			} else {
				System.out.println("Carattere non valido in posizione " + (i + 1));
				return;
			}

			// Applico la formula: valore * peso decrescente da 10 a 1
			somma += valore * (10 - i);
		}

		// Verifica finale: se la somma è divisibile per 11, l'ISBN è valido
		if (somma % 11 == 0) {
			System.out.println("✅ ISBN valido!");
		} else {
			System.out.println("❌ ISBN non valido.");
		}

		input.close(); // chiudo lo scanner
	}
}

package day_04;

import java.util.Scanner;

public class RicercaArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire nell'array? ");
		int dimensione = input.nextInt();

		int[] numeri = new int[dimensione];

		for (int i = 0; i < dimensione; i++) {
			System.out.println("Inserisci il numero " + i + ": ");
			numeri[i] = input.nextInt();
		}

		System.out.println("Inserisci il numero da cercare: ");
		int numeroDaCercare = input.nextInt();

		int posizione = -1;

		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] == numeroDaCercare) {
				posizione = -1;
				break;
			}
		}

		if (posizione != -1) {
			System.out.println("Numero trovato: " + posizione);
		} else {
			System.out.println("Numero non trovato.");
		}
		input.close();
	}
}

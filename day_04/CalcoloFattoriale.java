package day_04;

import java.util.Scanner;

public class CalcoloFattoriale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero: ");
		int numero = input.nextInt();
		int fattoriale = 1;

		for (int i = 1; i <= numero; i++) {
			fattoriale = fattoriale * i;
		}
		System.out.println("Il risultato di " + numero + " è: " + fattoriale);
		input.close();
	}
}
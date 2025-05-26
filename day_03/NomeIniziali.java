package day_03;

import java.util.Scanner;

public class NomeIniziali {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome: ");
		String nome = input.nextLine();
		System.out.println("Inserisci il tuo cognome: ");
		String cognome = input.nextLine();

		char iniziale1 = nome.charAt(0);
		System.out.println("La tua iniziale è: " + iniziale1);
		if (iniziale1 == 'D' || iniziale1 == 'd') {

			String[] D = { "DDDDD ", "D    D", "D    D", "D    D", "DDDDD " };
			for (int i = 0; i < D.length; i++) {
				System.out.println(D[i]);
			}
		} else {
			System.out.println("Lettera non supportata per ora.");
		}

		input.close();
	}

}

package day_03;

import java.util.Scanner;

public class InversioneStringa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la frase: ");
		String frase = input.nextLine();

		frase = frase.toLowerCase();
		frase = frase.replaceAll(" ", "");

		String invertita = "";
		for (int i = frase.length() - 1; i >= 0; i--) {
			invertita += frase.charAt(i);
		}
		System.out.println("Stringa invertita: " + invertita);

		input.close();
	}

}

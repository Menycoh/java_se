package day_03;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il testo: ");
		String testo = input.nextLine();

		testo = testo.toLowerCase();
		testo = testo.replaceAll(" ", "");

		String invertita = "";

		for (int i = testo.length() - 1; i >= 0; i--) {
			invertita += testo.charAt(i);

		}
		if (testo.equals(invertita)) {
			System.out.println("E' un palindromo!");
		} else {
			System.out.println("Non è un palindromo!");
		}

		input.close();

	}
}
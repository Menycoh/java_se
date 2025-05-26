package day_03;

import java.util.Scanner;

public class NumeroParole {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci la frase: ");
		String frase = input.nextLine();

		String[] parole = frase.split(" ");
		System.out.println("Il numero di parole è: " + parole.length);

		input.close();

	}

}

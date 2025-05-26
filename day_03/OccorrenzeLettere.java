package day_03;

import java.util.Scanner;

public class OccorrenzeLettere {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il testo: ");
		String testo = input.nextLine();
		System.out.println("Inserisci la lettera da ricercare: ");
		char lettera = input.nextLine().charAt(0);

		int count = 0;
		for (int i = 0; i < testo.length(); i++) {
			if (testo.charAt(i) == lettera) {
				count++;
			}
		}
		System.out.println("La lettera '" + lettera + "' compare " + count + " volte.");
		input.close();
	}
}
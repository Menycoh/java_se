package day_02;

import java.util.Scanner;

public class CalcoloMedia {

	public static void main(String[] args) {
		int a, b, c, media;

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci 3 numeri: ");

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		media = (a + b + c) / 3;

		System.out.println("Il risultato è: " + media);

		input.close();
	}

}

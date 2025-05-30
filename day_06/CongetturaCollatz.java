package day_06;

import java.util.Scanner;

public class CongetturaCollatz {

	public static int collatz(int n) {
		int passi = 0;

		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
				System.out.println(n);
				passi++;

			} else {
				n = 3 * n + 1;
				System.out.println(n);
				passi++;

			}

		}

		return passi;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un numero da cui partire: ");
		int n = input.nextInt();

		if (n <= 0) {
			System.out.println("Inserisci un numero maggiore di 0. ");
			input.close();
			return;
		}
		int passi = collatz(n);
		System.out.println("I passi necessari per arrivare a 1 sono: " + passi + " passi");

		input.close();
	}
}
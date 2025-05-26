package day_03;

import java.util.Scanner;

public class CalcoloPotenza {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero: ");
		double a = input.nextDouble();
		double b = input.nextDouble();

		a = Math.pow(a, b);

		System.out.println("Il risultato è: " + a);

		input.close();
	}

}

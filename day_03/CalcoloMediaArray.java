package day_03;

import java.util.Scanner;

public class CalcoloMediaArray {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire? ");
		int n = input.nextInt();

		double[] numeri = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci il numero " + (i + 1) + ": ");
			numeri[i] = input.nextDouble();

		}

		double somma = 0;
		for (int i = 0; i < n; i++) {
			somma += numeri[i];

		}
		double media = somma / n;

		input.close();
		System.out.println("La media è: " + media);
	}
}

package day_03;

import java.util.Scanner;

public class MineMaxArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire? ");
		int n = input.nextInt();

		double[] numeri = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci il numero " + (i + 1) + ": ");
			numeri[i] = input.nextDouble();
		}

		double max = numeri[0];
		double min = numeri[0];

		for (int i = 1; i < n; i++) {
			if (numeri[i] > max) {
				max = numeri[i];
			} else {
				min = numeri[i];
			}

		}
		System.out.println("Il max è: "+ max);
		System.out.println("Il min è: "+ min);

		input.close();
	}
}

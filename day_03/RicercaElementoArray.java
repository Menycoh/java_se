package day_03;

import java.util.Scanner;

public class RicercaElementoArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Quanti numeri vuoi inserire?");
		int n = input.nextInt();

		double[] numeri = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Inserisci il numero " + (i + 1) + ": ");

			numeri[i] = input.nextDouble();
		}
		System.out.println("Inserisci il numero da cercare: ");
		double scelta = input.nextDouble();
		
		boolean trovato = false;
		for (int i = 0; i < n; i++)
		{
			if(numeri[i] == scelta) {
				System.out.println("Numero trovato all'indice "+ i);
			trovato = true;
			break;
			}
		}
		if (!trovato) {
			System.out.println("Numero non trovato nell'array.");
		}
		input.close();

	}

}

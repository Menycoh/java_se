package day_02;

import java.util.Scanner;

public class area_rettangolo {

	public static void main(String[] args) {
		double base, altezza, area;
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci la lunghezza del rettangolo: ");
		base = input.nextDouble();
		System.out.println("Inserisci la larghezza del rettangolo: ");
		altezza = input.nextDouble();

		area = base * altezza;

		System.out.println("L'area del rettangolo è: " + area);

		input.close();

	}

}

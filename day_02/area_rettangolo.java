package day_02;

import java.util.Scanner;
/* Calcolo dell'area di un rettangolo
 * Traccia: Scrivi un programma Java che chieda all'utente di inserire la base
 *  e l'altezza di un rettangolo e stampi l'area corrispondente.*/
 
public class area_rettangolo {

	public static void main(String[] args) {
		double base, altezza, area;
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci la base del rettangolo: ");
		base = input.nextDouble();
		System.out.println("Inserisci la altezza del rettangolo: ");
		altezza = input.nextDouble();

		area = base * altezza;

		System.out.println("L'area del rettangolo è: " + area);

		input.close();

	}

}

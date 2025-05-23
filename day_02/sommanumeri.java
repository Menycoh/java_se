package day_02;

import java.util.Scanner;
/*Somma di due numeri
 * Traccia: Scrivi un programma Java che chieda all'utente
 *  di inserire duenumeri interi e stampi la loro somma.*/
 
public class sommanumeri {

	public static void main(String[] args) {
		double numero1,numero2,somma;

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero: ");
		numero1 = input.nextDouble();
		System.out.println("Inserisci il secondo numero: ");
		numero2 = input.nextDouble();

		somma  = numero1 + numero2;

		System.out.println("Il risultato è: " + somma );

		input.close();

	}

}

package day_04;

import java.util.Scanner;

public class VerificaNumeroPrimo {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci il numero: ");
		int numero = input.nextInt();
		boolean flag = false;
		
		for (int i = 2; i<= numero / 2; i++) {
			if(numero % i == 0) {
				flag = true;
				break;
			}
		}
		
		if (!flag) {
			System.out.println("Il numero è primo! ");
		}
		else {
			System.out.println("Il numero non è primo.");
		}
		input.close();
}
}
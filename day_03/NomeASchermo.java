package day_03;

import java.util.Scanner;

public class NomeASchermo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il nome: ");
		String nome = input.nextLine();
		int num_trattini = nome.length() + 2;

		System.out.print("+");
		for (int i = 0; i < num_trattini; i++) {
			System.out.print("-");
		}
		System.out.println("+");

		System.out.println("| " + nome + " |");
		System.out.print("+");

		for (int i = 0; i < num_trattini; i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}

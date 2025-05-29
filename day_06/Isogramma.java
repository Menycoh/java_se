package day_06;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Isogramma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci un testo o una parola: ");
		String testo = input.nextLine();

		testo = testo.toLowerCase();
		testo = testo.replace(" ", "");
		testo = testo.replace("-", "");
		
		Set<Character> lettereViste = new HashSet<>();
		boolean isIsogramma = true;
		
		for (int i = 0; i < testo.length(); i++) {
			char c = testo.charAt(i);
			
			
			if(lettereViste.contains(c)) {
				isIsogramma = false;
				break;
			}
			lettereViste.add(c);
		}
		
		if(isIsogramma) {
			System.out.println("✅ È un isogramma!");
			
		}else {
			System.out.println("Non è un isogramma.");
		}
		input.close();
		

	}
}
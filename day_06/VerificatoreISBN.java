package day_06;
import java.util.Scanner;
public class VerificatoreISBN {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	System.out.println("Inserisci un codice ISBN-10	(con o senza trattini)");
	String isbn = input.nextLine();
	
	isbn = isbn.replaceAll(" ", "");
	isbn = isbn.toUpperCase();
	isbn = isbn.replaceAll("-", "");
	
	if (isbn.length()!= 10) {
		System.out.println("Il codice deve avere assolutamente 10 caratteri (esclusi i trattini)!");
		return;
	}
	int somma = 0;
	
	for (int i = 0; i < 10; i++) {
		char c = isbn.charAt(i);
		int valore;
		
		if(i == 9 && c == 'X') {
			valore = 10;
			
		} else if(Character.isDigit(c)){
			valore = Character.getNumericValue(c);
		} else {
			System.out.println("Carattere non valido in posizione " + (i + 1));
			return;
		}
		somma += valore * (10-i);
		
	}
	if (somma % 11 == 0) {
	    System.out.println("✅ ISBN valido!");
	} else {
	    System.out.println("❌ ISBN non valido.");
	}
	
	input.close();
	}

}

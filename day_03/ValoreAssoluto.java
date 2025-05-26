package day_03;
import java.util.Scanner;
import java.lang.Math;
public class ValoreAssoluto {

	public static void main(String[] args) {
		
		int a;
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci il numero: ");
		a = input.nextInt();
		
		
		System.out.println("Il valore assoluto è: "+ Math.abs(a));
		
		
		
	}

}

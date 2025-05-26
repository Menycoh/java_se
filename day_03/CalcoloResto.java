package day_03;
import java.util.Scanner;
public class CalcoloResto {

	public static void main(String[] args) {
		int a,b;
		double resto;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci il primo numero: ");
		a = input.nextInt();
		b = input.nextInt();
		
		resto = a % b;
		
		System.out.println("Il risultato è: "+ resto);
		
		input.close();
	}

}

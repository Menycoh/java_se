package day_06;

import java.util.Scanner;

public class CongetturaCollatz {

	public static int collatzSteps(int n) {
		int steps = 0;
		
		while (n != 1) {
			if(n%2== 0) {
				n = n/2;
			}else {
				n = 3 *n+1;
			}
			System.out.println(n);
			steps++;
			
		}
		return steps;
	}
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci un numero: ");
		int n = input.nextInt();
		int result = collatzSteps(n);
		System.out.println("Numero di passi per arrivare a 1 partendo da " + n + ": " + result);
	}
}
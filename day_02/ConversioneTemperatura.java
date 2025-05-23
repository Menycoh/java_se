package day_02;
import java.util.Scanner;
public class ConversioneTemperatura {

	public static void main(String[] args) {
		double gradi_celsius,gradi_fahreneit;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci i gradi in Celsius: ");
		gradi_celsius = input.nextDouble();
		
		gradi_fahreneit = gradi_celsius * 9/5 + 32;
		
		System.out.println("I gradi in Fahreneit sono: "+gradi_fahreneit);

	}

}

package day_02_fisso;
import java.util.Scanner;
public class ConversioneTemperatura {

	public static void main(String[] args) {
	double gradi_celsius, gradi_farenheit;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Inserisci i gradi in Celsius: ");
	gradi_celsius = input.nextDouble();
	
	gradi_farenheit = gradi_celsius * 9/5 + 32;
	
	System.out.println("Il risultato della conversione è: " + gradi_farenheit);
	
	input.close();
	}

}

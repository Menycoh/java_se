package day_03;
import java.util.Scanner;
public class AreaTrapezio {

	public static void main(String[] args) {
	double base1,base2,altezza,area;
	
	Scanner input = new Scanner (System.in);
	System.out.println("Inserisci la prima base: ");
	base1 = input.nextDouble();
	System.out.println("Inserisci la seconda base: ");
	base2 = input.nextDouble();
	System.out.println("Inserisci l'altezza: ");
	altezza = input.nextDouble();
	
	area = (base1 + base2) * altezza / 2;
	
	System.out.println("Il risultato è: "+area);
	
	input.close();
		
	
	
	}

}

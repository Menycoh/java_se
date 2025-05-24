package day_02;
import java.util.Scanner;
public class OreMinuti {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	
	System.out.println("Inserisci un numero di minuti: ");
	int minuti = input.nextInt();
	
	int ore = minuti / 60;
	int minutirimanenti = minuti % 60;
	
	
	System.out.println("I minuti in ore sono: "+ ore +" ore e " + minutirimanenti + " minuti ");
	input.close();
	}

}

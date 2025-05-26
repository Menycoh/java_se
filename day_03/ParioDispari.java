package day_03;
import java.util.Scanner;
public class ParioDispari {

	public static void main(String[] args) {
	int a;
	
	Scanner input = new Scanner (System.in);
	System.out.println("Inserisci il numero: ");
	a = input.nextInt();
	
	String [] messaggi = {"Il numero è pari.", "Il numero è dispari."};
	System.out.println(messaggi[Math.abs(a % 2)]);
		
		

	}

}

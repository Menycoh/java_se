package day_02;
import java.util.Scanner;
public class CalcoloIva {

	public static void main(String[] args) {
	double prezzonetto,prezzototale;
	
	Scanner input = new Scanner (System.in);
	System.out.println("Inserisci il prezzo netto del prodotto: ");
	
	prezzonetto = input.nextDouble();
	
	prezzototale = prezzonetto * 1.22;
	
	System.out.println("Il prezzo più IVA è: "+prezzototale);
	
	input.close();
	}

}

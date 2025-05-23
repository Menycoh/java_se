package day_02;
import java.util.Scanner;
public class AreaCerchio {

	public static void main(String[] args) {
		final double PI = 3.14159;
		double raggio,area;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci il raggio del cerchio: ");
		raggio = input.nextDouble();
		
		area = PI * raggio * raggio;
		
		System.out.println("L'area è: "+ area);
		
		input.close();
		
	}

}

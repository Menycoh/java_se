package day_04;
import java.util.Scanner;
public class Matrice {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Quanti righe vuoi mettere? ");
		int righe = input.nextInt();
		
		System.out.println("Quante colonne vuoi mettere? ");
		int colonne = input.nextInt();
		int [][]matrice= new int [righe][colonne];
		
		System.out.println("Inserisci gli elementi della matrice: ");
		for (int i = 0; i < righe; i++) {
			for(int j= 0; j< colonne; j++) {
				System.out.println("Elemento [" + i + "][" + j +"]: ");
				matrice [i][j] = input.nextInt();
			}
		}
		System.out.println("Gli elementi inseriti nella matrice sono: ");
		for(int i = 0; i < righe; i++) {
			for(int j = 0; j< colonne; j++) {
				System.out.print(matrice[i][j] + " ");	
			}
			System.out.println();
		}
		input.close();
	}

}

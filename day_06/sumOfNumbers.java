package day_06;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        int numero = 0;
        int count = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci dei numeri: (0 se vuoi uscire.)");

        while (true) {
            numero = input.nextInt();
            if (numero == 0) {
                break;

            } else if (numero > 0) {
                sum += numero;
                count++;

            }
        }
        System.out.println("La somma è: " + sum);
        System.out.println("Il numero dei numeri è: " + count);

    }
}

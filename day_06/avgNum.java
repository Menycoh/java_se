package day_06;

import java.util.Scanner;

public class avgNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0;
        int count = 0;
        int sum = 0;
        int avg = 0;
        System.out.println("Inserisci i numeri (0 se vuoi uscire): ");

        while (true) {
            numero = input.nextInt();
            if (numero == 0) {
                break;
            } else if (numero > 0) {
                count++;
                sum += numero;
                avg = sum / count;


            }
        }
        System.out.println("La media è: "+ avg);
    }
}

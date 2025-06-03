package day_06;
import java.util.Scanner;

public class onlyPositives {
    public static void main(String[]args){
        double numero;

        while (true){
            System.out.println("Inserisci un numero: ");
            Scanner input = new Scanner(System.in);
            numero = input.nextDouble();

            if (numero < 0){
                System.out.println("Unsuitable number.");
                continue;
            } else if (numero == 0) {
                break;

            } else if (numero > 0) {
                numero = Math.pow(numero,2);
                System.out.println(numero);
                continue;
            }
            input.close();
        }




    }
}

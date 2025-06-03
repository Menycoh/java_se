package day_06;
import java.util.Scanner;

public class numberOfNegativeNumbers {
    public static void main (String[]args){
        int numero = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci dei numeri: (0 se vuoi uscire.)");

        while(true){
            numero = input.nextInt();
            if (numero < 0){
                count++;
            } else if (numero == 0) {
                System.out.println("Numero di numeri negativi: "+ count);
                break;
            }else{
                continue;

            }

            }
        }




}

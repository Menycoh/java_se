package day_06;
import java.util.Scanner;
public class numberOfNumbers {
    public static void main (String[]args){
        int numero = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);



        System.out.println("Inserisci dei numeri ('0' se vuoi uscire");
        while(true){

            numero = input.nextInt();
            if (numero != 0){
                count++;
            }
            if (numero == 0){
                break;
            }

        }
        System.out.println("Numeri inseriti: "+ count);
    }
}

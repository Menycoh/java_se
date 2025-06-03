import java.util.Scanner;
public class CounterWith4 {
    public static void main(String []args){
        int numero;

        System.out.println("Inserisci un numero (Se vuoi uscire, inserisci il 4.): ");
        while (true){
            Scanner input = new Scanner(System.in);
            numero = input.nextInt();
            if(numero == 4){
                break;
            }
            System.out.println("Hai inserito: "+ numero);


        }
        System.out.println("Good job, thank you!");
    }


}

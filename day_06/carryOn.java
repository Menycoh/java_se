import java.util.Scanner;
public class carryOn {
    public static void main(String[]args){

        String testo;
        while(true){
            System.out.println("Exit? (y exits)");
            Scanner input = new Scanner(System.in);
            testo = input.nextLine();

            if(testo.equals("y")){
                break;
            }
            System.out.println("Ok, let's carry on!");
        }
        System.out.println("Ready!");
    }

}

package bicicletta;

public class BikeTest {

	public static void main(String[] args) {
	Bicicletta bianchi = new Bicicletta("Bianchi", "MTB", 5, 16,5);
	Bicicletta scott = new Bicicletta();
	//Settare attributi dell'oggetto (bici) scott
	scott.setMarca("Scott");
	scott.setModello("BMX");
	scott.setMarcia(5);
	scott.setVelocità(18);
	scott.setkmPercorsi(3);
	
	//Stampa a schermo degli oggetti e i loro attributi
	System.out.println("Bici #1: ");
	System.out.println(bianchi);
	
	System.out.println("\nBici #2: ");
	System.out.println(scott);
	//Cambio marcia e pedala
	BikeController.cambiaMarcia(scott, 6);
	scott.pedala(2);
	
	   System.out.println("\n🚴 Dopo pedalata:");
       System.out.println(scott);
	
	}

}

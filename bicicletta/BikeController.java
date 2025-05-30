package bicicletta;

public class BikeController {
	public static void cambiaMarcia(Bicicletta bike, int nuovaMarcia) {
		if(nuovaMarcia < 1 || nuovaMarcia > 7) {
			System.out.println("Marcia non valida!");
			return;
		}
		bike.setMarcia(nuovaMarcia);
		bike.setVelocità(5 + nuovaMarcia * 2);
		
		
	}

}

package ereditarietà;

public class VeicoloTest {
	/*String marca, 
	String modello, String targa, boolean assicurazione*/
	public static void main(String[] args) {
	Veicolo moto = new Motocicletta("Honda","CBR1000-RR","CBEH23J", true,false);
	Auto auto = new Auto ("Fiat ", "Panda ","BF23SJU",true);
	Camion camion = new Camion ("Mercedes ", "BOH ", "GF23JSA",false,true);
	
	//System.out.println(moto);
	
	//System.out.println(camion);
	
	Elettrica tesla = new Elettrica("Tesla", "Model 3", "BNMX23", true);
	tesla.setAutonomiaKM(300);
	Veicolo [] veicoli = {moto, tesla,auto};
	 
	for(Veicolo v : veicoli) {
		System.out.println(v);
		if(v instanceof Elettrica) {
			System.out.println(((Elettrica)v).isBatteriaAlLitio());
		}
		/*if(b.isInstance(v)) {
			System.out.println(((Elettrica)v).isBatteriaAlLitio());*/

		}
		
			
			
		}
	}}
	



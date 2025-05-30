package casa;

public class casaTest {

	public static void main(String[] args) {
		casa casa1 = new casa("Via Bologna 14", 4, 55, 35);
		casa casa2 = new casa();

		casa2.setIndirizzo("Via Ferrara 17");
		casa2.setStanze(3);
		casa2.setSuperficie(47);
		casa2.setConsumo(25);

		System.out.println("Casa #1: ");
		System.out.println(casa1);

		casaController.aggiornaConsumo(casa2, 35);

		System.out.println("Casa #2: ");
		casaController.aggiornaConsumo(casa2, 25);
		System.out.println(casa2);

	}

}

package car;

public class carTest {

	public static void main(String[] args) {
		Car panda = new Car();
		Car ferrari = new Car("23999", "Ferrari", "F-40", 100.0, 1);
		Car bmw = new Car("42312", "BMW", "M3 Competition", 90.0, 1);
		// System.out.println("Targa Ferrari: "+ ferrari.getTarga());
		ferrari.setTarga("AAAAAAA");
		// System.out.println("Targa Ferrari: "+ ferrari.getTarga());
		bmw.setModello("M4 Comp");

		Car mercedes = new Car("BBBBBBB", "Mercedes", "C-Class", 89, 1);

		bmw.setFuel(100);
		panda.setTarga("CCCCCCC");
		panda.setMarca("Fiat");
		panda.setFuel(52);
		panda.setModello("Panda");
		panda.setConsumomedio(5);

		/*
		 * System.out.println("Panda:"); System.out.println("Targa Auto: "+
		 * panda.getTarga()); System.out.println("Marca Auto: "+ panda.getMarca());
		 * System.out.println("Modello Auto: "+panda.getModello());
		 * System.out.println("Carburante auto: "+panda.getFuel() + " litri");
		 * System.out.println("Consumo medio: "+panda.getConsumomedio()+
		 * " litri per km");
		 */

		/*System.out.println("Auto #1: \n" + panda.toString());
		System.out.println("Auto #2: \n" + bmw);
		System.out.println("Auto #3: \n" + ferrari);*/
		// Metodo giusto da entrambi i punti di vista
		CarController.aggiornaFuel(ferrari, 20);
		System.out.println(ferrari);
		// Giusto dal punto di vista sintattico ma sbagliato dal punto di vista logico
		CarController control = new CarController();
		control.aggiornaFuel(panda, 10);
		System.out.println(panda);

		System.out.println("panda");
		

		System.out.println(panda);
		CarController.aggiornaFuel(panda, 30);
		panda.setFuel(100);
	}

}

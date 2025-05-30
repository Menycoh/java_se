package car;

public class CarController {
	public static void aggiornaFuel(Car car, double km) {
		double consumo = km * car.getConsumomedio();
		car.setFuel(car.getFuel() - consumo);

	}

}

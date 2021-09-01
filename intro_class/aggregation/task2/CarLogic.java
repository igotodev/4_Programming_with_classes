package by.godev.intro_class.aggregation.task2;

public class CarLogic {
	public CarLogic() {

	}

	public void drive(Car c) {
		if (c.getEngine().getPowerKWT() > 0 && c.getWheels().length > 3 && c.getCapacity() > 0) {
			System.out.printf("Автомобиль %s %s поехал\n", c.getBrand(), c.getModel());
		} else {
			System.out.printf("Автомобиль %s %s не может ехать, без топлива или с отсутствующими элементами\n",
					c.getBrand(), c.getModel());
		}
	}

	public void refuel(Car c, double fuel) {
		double carFuel;

		carFuel = c.getCapacity();
		if (fuel < 0) {
			System.out.printf("Количество топлива не может быть отрицательным\n");
			return;
		}
		c.setCapacity(carFuel + fuel);
		System.out.printf("Автомобиль %s %s заправлен\n", c.getBrand(), c.getModel());
	}

	public void changeWheel(Car c, int wheelNumber) {
		int diameterInch;
		Wheel[] wheels;
		Wheel wheel;

		wheels = c.getWheels();

		if (wheelNumber > wheels.length || wheelNumber < 0) {
			System.out.printf("Такого колеса не существует\n");
			return;
		}

		diameterInch = wheels[wheelNumber].getDiameterInch();

		wheel = new Wheel(diameterInch);

		wheels[wheelNumber] = wheel;

		System.out.printf("Колесо №%d автомобиля %s %s успешно заменено\n", wheelNumber, c.getBrand(), c.getModel());
	}

}

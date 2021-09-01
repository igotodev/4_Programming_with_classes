package by.godev.intro_class.aggregation.task2;

/*
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
 * Методы: ехать, заправляться, менять колесо,вывести на консоль марку автомобиля.
 * */

public class Main {
	public static void main(String[] args) {
		CarLogic logic;
		CarView view;
		Car car;
		String brand;
		String model;
		Wheel[] wheels;
		Wheel wheel1;
		Wheel wheel2;
		Wheel wheel3;
		Wheel wheel4;
		int diameterWheelInch;
		Engine engine;
		String engineType;
		double enginePowerKWT;
		double capacity;

		brand = "audi";
		model = "a5";

		diameterWheelInch = 19;
		wheel1 = new Wheel(diameterWheelInch);
		wheel2 = new Wheel(diameterWheelInch);
		wheel3 = new Wheel(diameterWheelInch);
		wheel4 = new Wheel(diameterWheelInch);
		wheels = new Wheel[] { wheel1, wheel2, wheel3, wheel4 };

		engineType = "бензин";
		enginePowerKWT = 150.5;
		engine = new Engine(engineType, enginePowerKWT);
		capacity = 70;

		car = new Car(brand, model, wheels, engine, capacity);

		logic = new CarLogic();
		view = new CarView();

		logic.drive(car);
		logic.refuel(car, 10);
		logic.changeWheel(car, 2);

		view.printModel(car);
	}
}

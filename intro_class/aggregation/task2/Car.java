package by.godev.intro_class.aggregation.task2;

import java.util.Arrays;
import java.util.Objects;

public class Car {
	private String brand;
	private String model;
	private Wheel[] wheels;
	private Engine engine;
	private double capacity;

	private double maxCapacity;
	private double minCapacity;

	{
		maxCapacity = 80;
		minCapacity = 0;
	}

	public Car() {
		this.brand = new String("unknow");
		this.model = new String("unknow");
		this.wheels = new Wheel[] {};
		this.engine = new Engine();
		this.capacity = 0;
	}

	public Car(String brand, String model, Wheel[] wheels, Engine engine, double capacity) {
		this.brand = brand;
		this.model = model;
		this.wheels = wheels;
		this.engine = engine;
		if (capacity > maxCapacity) {
			this.capacity = maxCapacity;
			return;
		}
		if (capacity < minCapacity) {
			capacity = minCapacity;
			return;
		}
		this.capacity = capacity;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Wheel[] getWheels() {
		return this.wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return this.engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public double getCapacity() {
		return this.capacity;
	}

	public void setCapacity(double capacity) {
		if (capacity > maxCapacity) {
			this.capacity = maxCapacity;
			return;
		}
		if (capacity < minCapacity) {
			capacity = minCapacity;
			return;
		}
		this.capacity = capacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(wheels);
		result = prime * result + Objects.hash(brand, capacity, engine, model);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand)
				&& Double.doubleToLongBits(capacity) == Double.doubleToLongBits(other.capacity)
				&& Objects.equals(engine, other.engine) && Objects.equals(model, other.model)
				&& Arrays.equals(wheels, other.wheels);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [brand=" + brand + ", model=" + model + ", wheels="
				+ Arrays.toString(wheels) + ", engine=" + engine + ", capacity=" + capacity + "]";
	}

}

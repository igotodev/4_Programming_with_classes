package by.godev.intro_class.aggregation.task5;

public enum Transport {
	BUS("Автобус", 150), TRAIN("Поезд", 200), PLANE("Самолет", 800), CRUISE_SHIP("Круизный лайнер", 1000);

	private final double cost;
	private final String name;

	private Transport(String name, double cost) {
		this.cost = cost;
		this.name = name;
	}

	public double getCost() {
		return this.cost;
	}

	public String getName() {
		return this.name;
	}
}

package by.godev.intro_class.aggregation.task5;

public enum Hotel {
	FIVE_STARS("Отель 5 звезд", 120), FOUR_STARS("Отель 4 звезды", 80), THREE_STARS("Отель 3 звезды", 50),
	NOT_INCLUDET("Без отеля", 0);

	private final double cost;
	private final String name;

	private Hotel(String name, double cost) {
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

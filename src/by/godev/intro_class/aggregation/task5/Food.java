package by.godev.intro_class.aggregation.task5;

public enum Food {
	ALL_INCLUSIVE("Все включено", 15), BREAKFAST("Только завтрак", 7), NOT_INCLUDET("Без еды", 0);

	private final double cost;
	private final String name;

	private Food(String name, double cost) {
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

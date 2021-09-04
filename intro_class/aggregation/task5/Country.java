package by.godev.intro_class.aggregation.task5;

public enum Country {
	GEORGIA("Грузия", 300), GERMANY("Германия", 1000), UKRAINE("Украина", 150), EGYPT("Египет", 300),
	UK("Великобритания", 1200), USA("США", 1200), NORWAY("Норвегия", 800), SWEDEN("Швеция", 1000);

	private final double cost;
	private final String name;

	private Country(String name, double cost) {
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

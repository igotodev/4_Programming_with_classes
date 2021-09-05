package by.godev.intro_class.aggregation.task5;

public enum TourType {
	REST("Отдых", 300), EXCURSIONS("Экскурсия", 400), HEALING("Лечение", 800), SHOPPING("Шопинг", 300),
	CRUISE("Круиз", 500);

	private final double cost;
	private final String name;

	private TourType(String name, double cost) {
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

package by.godev.intro_class.aggregation.task3;

public class CountryView {
	public CountryView() {

	}

	public void printCountryInfo(Country c) {
		System.out.printf("Столица: %s\n", c.getCapital().getCityName());
		System.out.printf("Количество областей: %d\n", c.getRegions().length);
		System.out.printf("Площадь: %.2f км²\n", c.getArea());
		System.out.printf("Областные центры: ");
		for (Region r : c.getRegions()) {
			System.out.printf("%s, ", r.getRegionalСenter().getCityName());
		}
		System.out.printf("\n");
	}
}

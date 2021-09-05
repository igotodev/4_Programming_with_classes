package by.godev.intro_class.aggregation.task5;

public class TestTours {

	public TestTours() {

	}

	public TourPackages getTours() {
		TourPackages packages;
		int numberOfTours;
		final int week;
		Tour[] tours;

		numberOfTours = 5;
		tours = new Tour[numberOfTours];
		week = 7;
		tours[0] = new Tour(TourType.REST, Country.GEORGIA, Transport.PLANE, Hotel.FIVE_STARS, Food.ALL_INCLUSIVE,
				week * 2);
		tours[1] = new Tour(TourType.CRUISE, Country.EGYPT, Transport.CRUISE_SHIP, Hotel.NOT_INCLUDET,
				Food.ALL_INCLUSIVE, week * 2);
		tours[2] = new Tour(TourType.EXCURSIONS, Country.SWEDEN, Transport.PLANE, Hotel.FOUR_STARS, Food.BREAKFAST,
				week);
		tours[3] = new Tour(TourType.HEALING, Country.GERMANY, Transport.TRAIN, Hotel.FOUR_STARS, Food.ALL_INCLUSIVE,
				week * 2);
		tours[4] = new Tour(TourType.SHOPPING, Country.UKRAINE, Transport.BUS, Hotel.THREE_STARS, Food.NOT_INCLUDET,
				week);

		packages = new TourPackages(tours);

		return packages;
	}
}

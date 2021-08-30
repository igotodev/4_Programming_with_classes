package by.godev.intro_class.simple_class.task10;

public class AirlineSearch {

	public AirlineSearch() {

	}

	public OurAirlines searhByDestination(OurAirlines allAirlines, String destination) {
		OurAirlines result;

		result = new OurAirlines();

		for (Airline a : allAirlines.getAllAirlines()) {
			if (a.getDestination().equals(destination)) {
				result.addAirline(a);
			}
		}

		return result;
	}

	public OurAirlines searhByDaysOfWeek(OurAirlines allAirlines, String daysOfWeek) {
		OurAirlines result;

		result = new OurAirlines();

		for (Airline a : allAirlines.getAllAirlines()) {
			if (a.getDaysOfWeek().equals(daysOfWeek)) {
				result.addAirline(a);
			}
		}

		return result;
	}

	public OurAirlines searhByDaysOfWeekAfterTime(OurAirlines allAirlines, String daysOfWeek, Time afterTime) {
		OurAirlines result;
		result = new OurAirlines();

		for (Airline a : allAirlines.getAllAirlines()) {
			if (a.getDaysOfWeek().equals(daysOfWeek) && a.getDepartureTime().compareTo(afterTime) > 0) {
				result.addAirline(a);
			}
		}

		return result;
	}
}

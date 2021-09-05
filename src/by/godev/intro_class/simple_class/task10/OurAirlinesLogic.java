package by.godev.intro_class.simple_class.task10;

public class OurAirlinesLogic {
	public OurAirlinesLogic() {

	}

	public boolean simpleAirlineValidation(Airline[] allAirlines, Airline a) {
		if (allAirlines.length == 0) {
			return true;
		}

		for (int i = 0; i < allAirlines.length; i++) {
			if (a.equals(allAirlines[i])) {
				System.out.printf("Рейс №%s не будет добавлен. Данный рейс уже существует\n", a.getFlightNumber());
				return false;
			} else if (a.getDaysOfWeek() == allAirlines[i].getDaysOfWeek()
					&& a.getDepartureTime().equals(allAirlines[i].getDepartureTime())) {
				System.out.printf(
						"Рейс №%s не будет добавлен. Невозможно добавить идентичные рейсы на один и тот же день недели\n",
						a.getFlightNumber());
				return false;
			}

		}
		return true;
	}
}

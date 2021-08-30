package by.godev.intro_class.simple_class.task10;

public class ViewAirline {

	public ViewAirline() {

	}

	public void printAirline(Airline a) {
		ViewTime viewTime;
		
		viewTime = new ViewTime();
		
		System.out.printf("--------------------------------------------\n");
		System.out.printf("Пункт назначения: \t%s\n", a.getDestination());
		System.out.printf("Номер рейса: \t\t%d\n", a.getFlightNumber());
		System.out.printf("Тип самолета: \t\t%s\n", a.getAircraftType());
		System.out.printf("Время вылета: \t\t%s\n", viewTime.toFormatedString(a.getDepartureTime()));
		System.out.printf("Дни недели: \t\t%s\n\n", a.getDaysOfWeek());
	}

	public void printOurAirline(OurAirlines allAirline) {
		for (Airline a : allAirline.getAllAirlines()) {
			printAirline(a);
		}
	}
}

package by.godev.intro_class.simple_class.task10;

public class TestAirlines {
	public TestAirlines() {

	}

	public OurAirlines addTestAirlines() {
		OurAirlines allAirlines;
		Airline[] arr;
		int numberOfFlights;

		allAirlines = new OurAirlines();
		numberOfFlights = 5;
		arr = new Airline[numberOfFlights];

		arr[0] = new Airline("Париж", 18, "Пассажирский", new Time(12, 00), "Пятница");
		arr[1] = new Airline("Нью-Йорк", 14, "Пассажирский", new Time(10, 30), "Вторник");
		arr[2] = new Airline("Москва", 8, "Пассажирский", new Time(14, 00), "Понедельник");
		arr[3] = new Airline("Киев", 10, "Пассажирский", new Time(20, 00), "Вторник");
		arr[4] = new Airline("Берлин", 9, "Пассажирский", new Time(18, 00), "Четверг");

		for (int i = 0; i < arr.length; i++) {
			allAirlines.addAirline(arr[i]);
		}

		return allAirlines;
	}
}

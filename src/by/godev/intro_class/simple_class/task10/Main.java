package by.godev.intro_class.simple_class.task10;

/*
 * 10. Создать класс Airline, спецификация которого приведена ниже. 
 * Определить конструкторы, set-и get-методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль. 
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели. 
 * Найти и вывести: 
 * a) список рейсов для заданного пункта назначения; 
 * b) список рейсов для заданного дня недели; 
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 * */

public class Main {

	public static void main(String[] args) {
		TestAirlines test;
		AirlineSearch search;
		ViewAirline view;
		OurAirlines airlines;

		airlines = new OurAirlines();
		test = new TestAirlines();
		search = new AirlineSearch();
		view = new ViewAirline();

		airlines.setAllAirlines(test.addTestAirlines().getAllAirlines());

		System.out.println("Cписок рейсов для заданного пункта назначения: ");
		view.printOurAirline(search.searhByDestination(airlines, "Париж"));

		System.out.println("Cписок рейсов для заданного дня недели:");
		view.printOurAirline(search.searhByDaysOfWeek(airlines, "Вторник"));

		System.out.println("Cписок рейсов для заданного дня недели, время вылета для которых больше заданного:");
		view.printOurAirline(search.searhByDaysOfWeekAfterTime(airlines, "Вторник", new Time(19, 0)));
	}

}

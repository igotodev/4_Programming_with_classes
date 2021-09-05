package by.godev.intro_class.aggregation.task3;

/*
 * 3.Создать объект класса Государство, используя классы Область, Район, Город. 
 * Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 * */

public class Main {
	public static void main(String[] args) {
		TestCountry test;
		CountryView view; 
		Country belarus;
		
		view = new CountryView();
		test = new TestCountry();
		belarus = test.addTestCountry();
		
		view.printCountryInfo(belarus);
	}
}

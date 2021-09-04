package by.godev.intro_class.aggregation.task5;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической 
 * путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 * */

public class Main {

	public static void main(String[] args) {
		TourPackageView view;
		TourPackagesLogic logic;
		CustomChoice choice;
		TestTours test;
		TourPackages tours;
		double lessThen;

		test = new TestTours();
		tours = test.getTours();
		view = new TourPackageView();
		logic = new TourPackagesLogic();
		choice = new CustomChoice();
		lessThen = 3000;

		System.out.println("Сортировка туров по названию страны:");
		logic.sortToursByCountryName(tours);
		view.printTourPackagesInfo(tours);

		System.out.println("Сортировка туров по цене (от большей к меньшей):");
		logic.sortToursByPrice(tours);
		view.printTourPackagesInfo(tours);

		System.out.println("Выбор туров по типу:");
		view.printTourPackagesInfo(choice.selectByType(tours, TourType.REST));

		System.out.println("Выбор туров по стране:");
		view.printTourPackagesInfo(choice.selectByCountry(tours, Country.GEORGIA));

		System.out.println("Выбор туров по транспорту:");
		view.printTourPackagesInfo(choice.selectByTransport(tours, Transport.CRUISE_SHIP));

		System.out.println("Выбор туров по отелю:");
		view.printTourPackagesInfo(choice.selectByHotel(tours, Hotel.FIVE_STARS));

		System.out.println("Выбор тура по цене:");
		view.printTourPackagesInfo(choice.selectByPrice(tours, lessThen));
	}

}

package by.godev.intro_class.aggregation.task5;

public class TourPackageView {
	public TourPackageView() {

	}

	public void printTourInfo(Tour t) {
		System.out.printf("Тип тура:\t\t%s\n", t.getType().getName());
		System.out.printf("Страна:\t\t\t%s\n", t.getCountry().getName());
		System.out.printf("Транспорт:\t\t%s\n", t.getTransport().getName());
		System.out.printf("Отель:\t\t\t%s\n", t.getHotel().getName());
		System.out.printf("Еда:\t\t\t%s\n", t.getFood().getName());
		System.out.printf("Количество дней:\t%d\n", t.getNumberOfDays());
		System.out.printf("Цена:\t\t\t%.2f USD\n\n", t.getPrice());
	}

	public void printTourPackagesInfo(TourPackages tp) {
		System.out.println("------------------------------------------");
		for (Tour t : tp.getAllTourPackages()) {
			printTourInfo(t);
		}
	}
}

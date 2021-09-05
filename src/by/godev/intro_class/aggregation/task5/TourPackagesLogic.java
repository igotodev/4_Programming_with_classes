package by.godev.intro_class.aggregation.task5;

public class TourPackagesLogic {

	public TourPackagesLogic() {

	}

	public void sortToursByCountryName(TourPackages tours) {

		for (int i = 0; i < tours.getAllTourPackages().length; i++) {
			for (int j = 1; j < tours.getAllTourPackages().length - i; j++) {
				if (tours.getAllTourPackages()[j].getCountry().getName()
						.compareTo(tours.getAllTourPackages()[j - 1].getCountry().getName()) < 0) {
					Tour mid;
					mid = tours.getAllTourPackages()[j];
					tours.getAllTourPackages()[j] = tours.getAllTourPackages()[j - 1];
					tours.getAllTourPackages()[j - 1] = mid;
				}
			}
		}
	}

	// от большей суммы к меньшей
	public void sortToursByPrice(TourPackages tours) {
		for (int i = 0; i < tours.getAllTourPackages().length; i++) {
			for (int j = 1; j < tours.getAllTourPackages().length - i; j++) {
				if (tours.getAllTourPackages()[j].getPrice() > tours.getAllTourPackages()[j - 1].getPrice()) {
					Tour mid;
					mid = tours.getAllTourPackages()[j];
					tours.getAllTourPackages()[j] = tours.getAllTourPackages()[j - 1];
					tours.getAllTourPackages()[j - 1] = mid;
				}
			}
		}
	}
}

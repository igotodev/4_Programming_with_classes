package by.godev.intro_class.aggregation.task5;

import java.util.Arrays;

public class CustomChoice {
	public CustomChoice() {

	}

	public TourPackages selectByPrice(TourPackages tours, double lessThen) {
		TourPackages tp;
		Tour[] selectTours;

		selectTours = new Tour[] {};
		tp = new TourPackages();

		for (Tour t : tours.getAllTourPackages()) {
			if (t.getPrice() < lessThen) {
				selectTours = Arrays.copyOf(selectTours, selectTours.length + 1);
				selectTours[selectTours.length - 1] = t;
			}
		}

		tp.setAllTourPackages(selectTours);

		return tp;
	}

	public TourPackages selectByType(TourPackages tours, TourType type) {
		TourPackages tp;
		Tour[] selectTours;

		selectTours = new Tour[] {};
		tp = new TourPackages();

		for (Tour t : tours.getAllTourPackages()) {
			if (t.getType().equals(type)) {
				selectTours = Arrays.copyOf(selectTours, selectTours.length + 1);
				selectTours[selectTours.length - 1] = t;
			}
		}

		tp.setAllTourPackages(selectTours);

		return tp;
	}

	public TourPackages selectByCountry(TourPackages tours, Country country) {
		TourPackages tp;
		Tour[] selectTours;

		selectTours = new Tour[] {};
		tp = new TourPackages();

		for (Tour t : tours.getAllTourPackages()) {
			if (t.getCountry().equals(country)) {
				selectTours = Arrays.copyOf(selectTours, selectTours.length + 1);
				selectTours[selectTours.length - 1] = t;
			}
		}

		tp.setAllTourPackages(selectTours);

		return tp;
	}

	public TourPackages selectByTransport(TourPackages tours, Transport transport) {
		TourPackages tp;
		Tour[] selectTours;

		selectTours = new Tour[] {};
		tp = new TourPackages();

		for (Tour t : tours.getAllTourPackages()) {
			if (t.getTransport().equals(transport)) {
				selectTours = Arrays.copyOf(selectTours, selectTours.length + 1);
				selectTours[selectTours.length - 1] = t;
			}
		}

		tp.setAllTourPackages(selectTours);

		return tp;
	}

	public TourPackages selectByHotel(TourPackages tours, Hotel hotel) {
		TourPackages tp;
		Tour[] selectTours;

		selectTours = new Tour[] {};
		tp = new TourPackages();

		for (Tour t : tours.getAllTourPackages()) {
			if (t.getHotel().equals(hotel)) {
				selectTours = Arrays.copyOf(selectTours, selectTours.length + 1);
				selectTours[selectTours.length - 1] = t;
			}
		}

		tp.setAllTourPackages(selectTours);

		return tp;
	}

}

package by.godev.intro_class.simple_class.task4;

public class TrainsLogic {

	public static void sortByNumber(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			for (int j = 1; j < trains.length - i; j++) {
				Train mid;

				if (trains[j].getTrainNumber() < trains[j - 1].getTrainNumber()) {
					mid = trains[j];
					trains[j] = trains[j - 1];
					trains[j - 1] = mid;
				}
			}
		}
	}

	public static void sortByDestinationName(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			for (int j = 1; j < trains.length - i; j++) {
				Train mid;

				if (trains[j].getDestinationName().compareTo(trains[j - 1].getDestinationName()) < 0) {
					mid = trains[j];
					trains[j] = trains[j - 1];
					trains[j - 1] = mid;
				} else if (trains[j].getDestinationName().compareTo(trains[j - 1].getDestinationName()) == 0) {
					if (trains[j].getDepartureTime().compareTo(trains[j - 1].getDepartureTime()) < 0) {
						mid = trains[j];
						trains[j] = trains[j - 1];
						trains[j - 1] = mid;
					}
				}
			}
		}

	}

}

package by.godev.intro_class.simple_class.task4;

public class TrainsView {

	public static void printTrainInfo(Train[] trains, int trainNumber) {
		int count;

		count = 0;

		for (int i = 0; i < trains.length; i++) {
			if (trains[i].getTrainNumber() == trainNumber) {
				System.out.printf("Поезд №       \t\t%d\n", trains[i].getTrainNumber());
				System.out.printf("Пункт назначения   \t%s\n", trains[i].getDestinationName());
				System.out.printf("Время отправления\t%s\n", trains[i].getDepartureTime());
				System.out.printf("\n");
				count++;
			}
		}

		if (count == 0) {
			System.out.printf("Поезд с таким номером не существует!\n");
			return;
		}
	}

	public static void printAllTrainsInfo(Train[] trains) {
		for (int i = 0; i < trains.length; i++) {
			System.out.printf("Поезд №       \t\t%d\n", trains[i].getTrainNumber());
			System.out.printf("Пункт назначения   \t%s\n", trains[i].getDestinationName());
			System.out.printf("Время отправления\t%s\n", trains[i].getDepartureTime());
			System.out.printf("\n");
		}

	}
}

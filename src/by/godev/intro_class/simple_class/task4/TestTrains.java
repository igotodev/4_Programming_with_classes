package by.godev.intro_class.simple_class.task4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestTrains {

	public static void addTrains(Train[] trains) {
		String[] cityNames;
		String[] departTime;
		int[] trainNumbers;

		cityNames = new String[] { "Берлин", "Минск", "Одесса", "Киев", "Варшава", "Берлин", "Талин", "Рига", "Вена",
				"Прага" };
		departTime = new String[] { "05:00", "06:00", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00",
				"14:00" };
		trainNumbers = generationUniqueTrainNumbers(trains.length);

		for (int i = 0; i < trains.length; i++) {
			trains[i] = new Train(cityNames[randNumber(0, 9)], trainNumbers[i], departTime[randNumber(0, 9)]);
		}
	}

	private static int[] generationUniqueTrainNumbers(int len) {
		int[] trainNumbers;
		int midNum; // переменная для уникализации номера поезда

		trainNumbers = new int[len];
		midNum = 1;
		for (int i = 0; i < len; i++) {
			trainNumbers[i] = randNumber(midNum, midNum + len);
			midNum = midNum + len + 1;
		}

		return trainNumbers;
	}

	private static int randNumber(int min, int max) {
		Random rand = new Random();
		long newRandSeed;
		int num;

		newRandSeed = ThreadLocalRandom.current().nextLong();
		rand.setSeed(newRandSeed);
		num = -1;

		while (num < min) {
			num = rand.nextInt(max + 1);
		}

		return num;
	}
}

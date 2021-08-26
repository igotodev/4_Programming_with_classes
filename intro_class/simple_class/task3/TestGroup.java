package by.godev.intro_class.simple_class.task3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestGroup {

	public static Student[] addStudents(final int len) {
		Student[] students;
		String[] names;

		students = new Student[len];
		names = new String[] { "Gosling J", "Naughton P", "Ritchie D", "Kernighan B", "Thompson K", "Torvalds L",
				"Prata S", "Eckel B", "Schildt H", "Stroustrup B" };

		for (int i = 0; i < len; i++) {
			int[] arr;

			// Тестовые ученики довольно сильные, поэтому минимальная рандомная оценка 8
			arr = new int[] { randNumber(8, 10), randNumber(8, 10), randNumber(8, 10), randNumber(8, 10),
					randNumber(8, 10) };
			students[i] = new Student();
			students[i].setFullName(names[i]);
			students[i].setGroupNumber(randNumber(1, 3));
			students[i].setProgress(arr);
		}

		return students;
	}

	private static int randNumber(int min, int max) {
		Random rand = new Random();
		long newRandSeed;
		int num;

		newRandSeed = ThreadLocalRandom.current().nextLong();
		rand.setSeed(newRandSeed);
		num = 0;

		while (num < min) {
			num = rand.nextInt(max + 1);
		}

		return num;
	}
}

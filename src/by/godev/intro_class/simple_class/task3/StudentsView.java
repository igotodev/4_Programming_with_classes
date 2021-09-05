package by.godev.intro_class.simple_class.task3;

public class StudentsView {

	public static void printBestStudents(final Student[] students) {
		int bestStudent;

		bestStudent = 0;

		for (int i = 0; i < students.length; i++) {
			int count;

			count = 0;

			for (int j = 0; j < students[i].getProgress().length; j++) {
				if (students[i].getProgress()[j] > 8) {
					count++;
				}
			}

			if (count == 5) {
				bestStudent++;
				System.out.printf("%s, группа %d\n", students[i].getFullName(), students[i].getGroupNumber());
			}
		}

		if (bestStudent == 0) {
			System.out.printf("К сожалению, ни в одной из групп нет отличников.\nНужно срочно что-то менять...\n");
		}

	}
}

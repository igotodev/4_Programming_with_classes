package by.godev.intro_class.simple_class.task3;

/*
 * 3. Создайте классс именем Student, содержащий поля: фамилия и инициалы, номер группы, 
 * успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 * */

public class Main {

	public static void main(String[] args) {
		Student[] students;
		int numberStudents;

		numberStudents = 10;
		students = new Student[numberStudents];
		students = TestGroup.addStudents(numberStudents);

		StudentsView.printBestStudents(students);
	}

}

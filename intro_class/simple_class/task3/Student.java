package by.godev.intro_class.simple_class.task3;

import java.util.Arrays;

/*
 * 3. Создайте классс именем Student, содержащий поля: фамилия и инициалы, номер группы, 
 * успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа. 
 * Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 * */

public class Student {
	private String fullName;
	private int groupNumber;
	private int[] progress;

	public Student() {
		this.fullName = "";
		this.groupNumber = 0;
		this.progress = new int[] { 0, 0, 0, 0, 0 };
	}

	public Student(String name, int group, int[] progress) {
		this.fullName = name;
		this.groupNumber = group;
		if (progress.length != 5) {
			System.out.println("Неверный размер массива! Размер массиива должен быть равен 5");
			return;
		}
		this.progress = progress;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public void setProgress(int[] progress) {
		if (progress.length != 5) {
			System.out.println("Неверный размер массива! Размер массиива должен быть равен 5");
			return;
		}
		this.progress = progress;
	}

	public String getFullName() {
		return this.fullName;
	}

	public int getGroupNumber() {
		return this.groupNumber;
	}

	public int[] getProgress() {
		return this.progress;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [fullName=" + fullName + ", groupNumber=" + groupNumber
				+ ", progress=" + Arrays.toString(progress) + "]";
	}

}

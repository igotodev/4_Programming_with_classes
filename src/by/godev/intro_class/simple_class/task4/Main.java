package by.godev.intro_class.simple_class.task4;

import java.util.Scanner;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
 * должны быть упорядочены по времени отправления.
 * */

public class Main {

	public static void main(String[] args) {
		Train[] trains;
		int numberOfAllTrains;
		int trainNumber;

		numberOfAllTrains = 5;
		trains = new Train[numberOfAllTrains];

		TestTrains.addTrains(trains);

		System.out.printf("Все поезда отсортированные\nпо номеру:" + "\n---------------------------\n");
		TrainsLogic.sortByNumber(trains);
		TrainsView.printAllTrainsInfo(trains);

		System.out.printf("\nВсе поезда отсортированные\nпо пункту назначения:" + "\n---------------------------\n");
		TrainsLogic.sortByDestinationName(trains);
		TrainsView.printAllTrainsInfo(trains);

		System.out.printf("Пожалуйста, введите номер поезда: ");
		trainNumber = valueFromConsole();
		TrainsView.printTrainInfo(trains, trainNumber);

	}

	public static int valueFromConsole() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int value;

		value = 0;

		while (!scan.hasNextInt()) {
			System.out.printf("Пожалуйста, введите целое число: ");
			scan.next();
		}
		value = scan.nextInt();

		return value;
	}

}

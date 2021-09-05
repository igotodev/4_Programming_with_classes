package by.godev.intro_class.simple_class.task5;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать 
 * или уменьшать свое значение на единицу в заданном диапазоне.  
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и методы позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующийвсе возможности класса.
 * */

public class Main {

	public static void main(String[] args) {
		DecimalCounter counter;
		int minValue;
		int maxValue;
		int value;

		minValue = 1;
		maxValue = 10;
		value = 1;
		counter = new DecimalCounter(value, minValue, maxValue);

		System.out.printf("Заданый диапазон от %d до %d\n", counter.getMinValue(), counter.getMaxValue());
		System.out.println("Значение счетчика после инициализации: " + counter.getCount());

		counter.increaseСounter();
		System.out.println("Значение счетчика после вызова метода увеличения: " + counter.getCount());

		counter.decreaseСounter();
		System.out.println("Значение счетчика после вызова метода уменьшения: " + counter.getCount());

	}

}

package by.godev.intro_class.simple_class.task5;

import java.util.Objects;

/*
 * 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать 
 * или уменьшать свое значение на единицу в заданном диапазоне.  
 * Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
 * Счетчик имеет методы увеличения и уменьшения состояния, и методы позволяющее получить его текущее состояние. 
 * Написать код, демонстрирующийвсе возможности класса.
 * */

public class DecimalCounter {
	private int count;
	private int minValue;
	private int maxValue;

	public DecimalCounter() {
		this.count = 0;
		this.minValue = -2147483648;
		this.maxValue = 2147483647;
	}

	public DecimalCounter(int value) {
		this.count = value;
		this.minValue = -2147483648;
		this.maxValue = 2147483647;
	}

	public DecimalCounter(int value, int minValue, int maxValue) {
		if (minValue > maxValue) {
			this.minValue = maxValue;
			this.maxValue = minValue;
		} else {
			this.minValue = minValue;
			this.maxValue = maxValue;
		}

		if (this.minValue > value || this.maxValue < value) {
			DecimalCounterError
					.fatalError("Неверная инициализация объекта DecimalCounter: value < minValue || value > maxValue");
		}

		this.count = value;
	}

	public void setCount(int value) {
		if (this.minValue > value || this.maxValue < value) {
			DecimalCounterError.error("Превышен установленный диапазон значений.");
			return;
		}
		this.count = value;
	}

	public void setMinValue(int minValue) {
		if (this.maxValue < minValue) {
			DecimalCounterError
					.error("Превышен установленный диапазон значений. Возможно, стоит изменить maxValue первой.");
			return;
		}
		this.minValue = minValue;

	}

	public void setMaxValue(int maxValue) {
		if (this.minValue > maxValue) {
			DecimalCounterError
					.error("Превышен установленный диапазон значений. Возможно, стоит изменить minValue первой.");
			return;
		}
		this.maxValue = maxValue;
	}

	public void setMinMaxValue(int minValue, int maxValue) {
		if (minValue > maxValue) {
			this.minValue = maxValue;
			this.maxValue = minValue;
		} else {
			this.minValue = minValue;
			this.maxValue = maxValue;
		}
	}

	public int getCount() {
		return this.count;
	}

	public int getMaxValue() {
		return this.maxValue;
	}

	public int getMinValue() {
		return this.minValue;
	}

	public void increaseСounter() {
		if (minValue > this.count + 1 || maxValue < this.count + 1) {
			DecimalCounterError.error("Превышен установленный диапазон значений.");
			return;
		}
		this.count++;
	}

	public void decreaseСounter() {
		if (minValue > this.count - 1 || maxValue < this.count - 1) {
			DecimalCounterError.error("Превышен установленный диапазон значений.");
			return;
		}
		this.count--;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [count=" + count + ", minValue=" + minValue + ", maxValue="
				+ maxValue + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(count, maxValue, minValue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DecimalCounter other = (DecimalCounter) obj;
		return count == other.count && maxValue == other.maxValue && minValue == other.minValue;
	}

}

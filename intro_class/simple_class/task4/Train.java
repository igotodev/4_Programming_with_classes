package by.godev.intro_class.simple_class.task4;

import java.util.Objects;

/*
 * 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. 
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. 
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения 
 * должны быть упорядочены по времени отправления.
 * */

public class Train {
	private String destinationName;
	private int trainNumber;
	private String departureTime;

	public Train() {
		this.destinationName = "";
		this.trainNumber = 0;
		this.departureTime = "00:00";
	}

	public Train(String destinationName, int trainNumber, String departureTime) {
		this.destinationName = destinationName;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestinationName() {
		return this.destinationName;
	}

	public int getTrainNumber() {
		return this.trainNumber;
	}

	public String getDepartureTime() {
		return this.departureTime;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [destinationName=" + destinationName + ", trainNumber=" + trainNumber
				+ ", departureTime=" + departureTime + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(departureTime, destinationName, trainNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(departureTime, other.departureTime)
				&& Objects.equals(destinationName, other.destinationName) && trainNumber == other.trainNumber;
	}

}

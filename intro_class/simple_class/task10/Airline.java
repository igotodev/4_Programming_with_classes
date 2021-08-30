package by.godev.intro_class.simple_class.task10;

import java.util.Objects;

// destination, flightNumber, aircraftType, departureTime, daysOfWeek
public class Airline {
	private String destination;
	private int flightNumber;
	private String aircraftType;
	private Time departureTime;
	private String daysOfWeek;

	public Airline() {
		this.destination = new String("");
		this.flightNumber = 0;
		this.aircraftType = new String("");
		this.departureTime = new Time(0, 0);
		this.daysOfWeek = new String("");
	}

	public Airline(String destination, int flightNumber, String aircraftType, Time departureTime, String daysOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.daysOfWeek = daysOfWeek;
	}

	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return this.flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAircraftType() {
		return this.aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public Time getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getDaysOfWeek() {
		return this.daysOfWeek;
	}

	public void setDaysOfWeek(String daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aircraftType, daysOfWeek, departureTime, destination, flightNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Airline other = (Airline) obj;
		return Objects.equals(aircraftType, other.aircraftType) && Objects.equals(daysOfWeek, other.daysOfWeek)
				&& Objects.equals(departureTime, other.departureTime) && Objects.equals(destination, other.destination)
				&& flightNumber == other.flightNumber;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [destination=" + destination + ", flightNumber=" + flightNumber
				+ ", aircraftType=" + aircraftType + ", departureTime=" + departureTime + ", daysOfWeek=" + daysOfWeek
				+ "]";
	}

}

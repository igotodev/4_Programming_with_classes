package by.godev.intro_class.aggregation.task5;

import java.util.Objects;

public class Tour {
	private TourType type;
	private Country country;
	private Transport transport;
	private Hotel hotel;
	private Food food;
	private int numberOfDays;
	private double price;

	public Tour(TourType type, Country country, Transport transport, Hotel hotel, Food food, int numberOfDays) {
		this.type = type;
		this.country = country;
		this.transport = transport;
		this.hotel = hotel;
		this.food = food;
		this.numberOfDays = numberOfDays;
		this.price = type.getCost() + country.getCost() + transport.getCost()
				+ ((hotel.getCost() + food.getCost()) * numberOfDays);
	}

	public TourType getType() {
		return this.type;
	}

	public void setType(TourType type) {
		this.type = type;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Transport getTransport() {
		return this.transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Food getFood() {
		return this.food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getNumberOfDays() {
		return this.numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public double getPrice() {
		return this.price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, food, hotel, numberOfDays, price, transport, type);
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
		Tour other = (Tour) obj;
		return country == other.country && food == other.food && hotel == other.hotel
				&& numberOfDays == other.numberOfDays
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& transport == other.transport && type == other.type;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [type=" + type + ", country=" + country + ", transport=" + transport
				+ ", hotel=" + hotel + ", food=" + food + ", numberOfDays=" + numberOfDays + ", price=" + price + "]";
	}

}

package by.godev.intro_class.aggregation.task3;

import java.util.Objects;

public class City {
	private String cityName;

	public City() {
		this.cityName = new String("");
	}

	public City(String cityName) {
		this.cityName = cityName;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cityName);
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
		City other = (City) obj;
		return Objects.equals(cityName, other.cityName);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [cityName=" + cityName + "]";
	}
}

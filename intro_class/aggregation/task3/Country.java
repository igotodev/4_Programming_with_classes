package by.godev.intro_class.aggregation.task3;

import java.util.Arrays;
import java.util.Objects;

public class Country {
	private String countryName;
	private double area;
	private City capital;
	private Region[] regions;

	public Country() {
		this.countryName = new String("");
		this.area = 0;
		this.capital = new City();
		this.regions = new Region[] {};
	}

	public Country(String countryName, double area, City capital, Region[] regions) {
		this.countryName = countryName;
		this.area = area;
		this.capital = capital;
		this.regions = regions;
	}

	public String getStateName() {
		return this.countryName;
	}

	public void setStateName(String countryName) {
		this.countryName = countryName;
	}

	public double getArea() {
		return this.area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public City getCapital() {
		return this.capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public Region[] getRegions() {
		return this.regions;
	}

	public void setRegions(Region[] regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(regions);
		result = prime * result + Objects.hash(area, capital, countryName);
		return result;
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
		Country other = (Country) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Objects.equals(capital, other.capital) && Arrays.equals(regions, other.regions)
				&& Objects.equals(countryName, other.countryName);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [countryName=" + countryName + ", area=" + area + ", capital="
				+ capital + ", regions=" + Arrays.toString(regions) + "]";
	}

}

package by.godev.intro_class.aggregation.task3;

import java.util.Arrays;
import java.util.Objects;

public class District {
	private City districtСenter;
	private City[] cities;

	public District() {
		this.districtСenter = new City();
		this.cities = new City[] {};
	}

	public District(City[] cities, City districtСenter) {
		this.districtСenter = districtСenter;
		this.cities = cities;
	}

	public City getDistrictСenter() {
		return this.districtСenter;
	}

	public void setDistrictСenter(City districtСenter) {
		this.districtСenter = districtСenter;
	}

	public City[] getCities() {
		return this.cities;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cities);
		result = prime * result + Objects.hash(districtСenter);
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
		District other = (District) obj;
		return Arrays.equals(cities, other.cities) && Objects.equals(districtСenter, other.districtСenter);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [districtСenter=" + districtСenter + ", cities="
				+ Arrays.toString(cities) + "]";
	}
}

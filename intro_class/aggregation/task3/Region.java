package by.godev.intro_class.aggregation.task3;

import java.util.Arrays;
import java.util.Objects;

public class Region {
	private City regionalСenter;
	private District[] districts;

	public Region() {
		this.regionalСenter = new City();
		this.districts = new District[] {};
	}

	public Region(District[] districts, City regionalСenter) {
		this.regionalСenter = regionalСenter;
		this.districts = districts;
	}

	public City getRegionalСenter() {
		return this.regionalСenter;
	}

	public void setRegionalСenter(City regionalСenter) {
		this.regionalСenter = regionalСenter;
	}

	public District[] getDistricts() {
		return this.districts;
	}

	public void setDistricts(District[] districts) {
		this.districts = districts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(districts);
		result = prime * result + Objects.hash(regionalСenter);
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
		Region other = (Region) obj;
		return Arrays.equals(districts, other.districts) && Objects.equals(regionalСenter, other.regionalСenter);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [regionalСenter=" + regionalСenter + ", districts="
				+ Arrays.toString(districts) + "]";
	}

}

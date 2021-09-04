package by.godev.intro_class.aggregation.task5;

import java.util.Arrays;

public class TourPackages {
	private Tour[] allTourPackages;
	
	public TourPackages() {
		this.allTourPackages = new Tour[] {}; 
	}
	
	public TourPackages(Tour[] tourPackages) {
		this.allTourPackages = tourPackages;
	}
 
	public Tour[] getAllTourPackages() {
		return this.allTourPackages;
	}

	public void setAllTourPackages(Tour[] allTurPackages) {
		this.allTourPackages = allTurPackages;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(allTourPackages);
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
		TourPackages other = (TourPackages) obj;
		return Arrays.equals(allTourPackages, other.allTourPackages);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [allTourPackages=" + Arrays.toString(allTourPackages) + "]";
	}

}

package by.godev.intro_class.simple_class.task10;

import java.util.Arrays;

public class OurAirlines {
	private Airline[] allAirlines;

	public OurAirlines() {
		this.allAirlines = new Airline[] {};
	}

	public Airline[] getAllAirlines() {
		return allAirlines;
	}

	public void setAllAirlines(Airline[] allAirlines) {
		this.allAirlines = allAirlines;
	}

	public boolean addAirline(Airline a) {
		OurAirlinesLogic logic;

		logic = new OurAirlinesLogic();

		if (!logic.simpleAirlineValidation(allAirlines, a)) {
			return false;
		}

		this.allAirlines = Arrays.copyOf(this.getAllAirlines(), this.getAllAirlines().length + 1);
		this.allAirlines[this.allAirlines.length - 1] = a;

		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(allAirlines);
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

		OurAirlines other = (OurAirlines) obj;

		return Arrays.equals(allAirlines, other.allAirlines);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [allAirlines=" + Arrays.toString(allAirlines) + "]";
	}
}

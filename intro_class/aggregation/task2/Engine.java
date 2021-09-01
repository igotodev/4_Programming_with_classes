package by.godev.intro_class.aggregation.task2;

import java.util.Objects;

public class Engine {
	private String engineType;
	private double powerKWT;

	public Engine() {
		this.engineType = new String("unknown");
		this.powerKWT = 0;
	}

	public Engine(String engineType, double powerKWT) {
		this.engineType = engineType;
		this.powerKWT = powerKWT;
	}

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public double getPowerKWT() {
		return this.powerKWT;
	}

	public void setPowerKWT(double powerKWT) {
		this.powerKWT = powerKWT;
	}

	@Override
	public int hashCode() {
		return Objects.hash(engineType, powerKWT);
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
		Engine other = (Engine) obj;
		return Objects.equals(engineType, other.engineType)
				&& Double.doubleToLongBits(powerKWT) == Double.doubleToLongBits(other.powerKWT);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [engineType=" + engineType + ", powerKWT=" + powerKWT + "]";
	}

}

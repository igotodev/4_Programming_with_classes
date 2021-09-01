package by.godev.intro_class.aggregation.task2;

import java.util.Objects;

public class Wheel {
	private int diameterInch;
	
	public Wheel() {
		this.diameterInch = 0;
	}
	
	public Wheel(int diameterInch) {
		this.diameterInch = diameterInch;
	}

	public int getDiameterInch() {
		return this.diameterInch;
	}

	public void setDiameterInch(int diameterInch) {
		this.diameterInch = diameterInch;
	}

	@Override
	public int hashCode() {
		return Objects.hash(diameterInch);
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
		Wheel other = (Wheel) obj;
		return diameterInch == other.diameterInch;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [diameterInch=" + diameterInch + "]";
	}
}

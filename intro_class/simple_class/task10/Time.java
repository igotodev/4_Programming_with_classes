package by.godev.intro_class.simple_class.task10;

import java.util.Objects;

public class Time {
	private byte hours;
	private byte minutes;

	private final byte maxHours;
	private final byte maxMinutes;
	private final byte minValue;

	{
		maxHours = 23;
		maxMinutes = 59;
		minValue = 0;
	}

	public Time() {
		this.hours = 0;
		this.minutes = 0;
	}

	public Time(byte hours, byte minutes) {
		this.setHours(hours);
		this.setMinutes(minutes);

	}

	public Time(int hours, int minutes) {
		this.setHours(hours);
		this.setMinutes(minutes);
	}

	public byte getHours() {
		return this.hours;
	}

	public byte getMinutes() {
		return this.minutes;
	}

	public void setHours(byte hours) {
		if (hours > this.maxHours) {
			this.hours = 0;
			return;
		} else if (hours < this.minValue) {
			this.hours = 0;
			return;
		}

		this.hours = hours;
	}

	public void setHours(int hours) {
		if ((byte) hours > this.maxHours) {
			this.hours = 0;
			return;
		} else if ((byte) hours < this.minValue) {
			this.hours = 0;
			return;
		}

		this.hours = (byte) hours;
	}

	public void setMinutes(byte minutes) {
		if (minutes > this.maxMinutes) {
			this.minutes = 0;
			return;
		} else if (minutes < this.minValue) {
			this.minutes = 0;
			return;
		}

		this.minutes = minutes;
	}

	public void setMinutes(int minutes) {
		if ((byte) minutes > this.maxMinutes) {
			this.minutes = 0;
			return;
		} else if ((byte) minutes < this.minValue) {
			this.minutes = 0;
			return;
		}

		this.minutes = (byte) minutes;
	}

	public int compareTo(Time t) {
		if (this.getHours() > t.getHours()) {
			return 1;
		}
		if (this.getHours() == t.getHours()) {
			if (this.getMinutes() > t.getMinutes()) {
				return 1;
			}
			if (this.getMinutes() == t.getMinutes()) {
				return 0;
			}
			return -1;
		}

		return -1;

	}

	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes);
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
		Time other = (Time) obj;
		return hours == other.hours && minutes == other.minutes;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [hours=" + hours + ", minutes=" + minutes + "]";
	}

}

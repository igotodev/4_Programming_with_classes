package by.godev.intro_class.simple_class.task6;

import java.util.Objects;

/*
 * 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени 
 * и изменения его отдельных полей (час, минута, секунда)с проверкой допустимости вводимых значений. 
 * В случае недопустимых значений полей поле устанавливается в значение 0.  
 * Создать методы изменения времени на заданное количество часов, минут и секунд.
 * */

public class Time {
	private byte hours;
	private byte minutes;
	private byte seconds;

	private final byte maxHours;
	private final byte maxMinutes;
	private final byte maxSeconds;
	private final byte minValue;

	{
		maxHours = 23;
		maxMinutes = 59;
		maxSeconds = 59;
		minValue = 0;
	}

	public Time() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}

	public Time(byte hours, byte minutes, byte seconds) {
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(seconds);

	}

	public Time(int hours, int minutes, int seconds) {
		this.setHours(hours);
		this.setMinutes(minutes);
		this.setSeconds(seconds);
	}

	public byte getHours() {
		return this.hours;
	}

	public byte getMinutes() {
		return this.minutes;
	}

	public byte getSeconds() {
		return this.seconds;
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

	public void setSeconds(byte seconds) {
		if (seconds > this.maxSeconds) {
			this.seconds = 0;
			return;
		} else if (seconds < this.minValue) {
			this.seconds = 0;
			return;
		}

		this.seconds = seconds;
	}

	public void setSeconds(int seconds) {
		if ((byte) seconds > this.maxSeconds) {
			this.seconds = 0;
			return;
		} else if ((byte) seconds < this.minValue) {
			this.seconds = 0;
			return;
		}

		this.seconds = (byte) seconds;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hours, minutes, seconds);
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
		return hours == other.hours && minutes == other.minutes && seconds == other.seconds;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds
				+ "]";
	}

}

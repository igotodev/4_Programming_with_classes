package by.godev.intro_class.simple_class.task10;

public class ViewTime {
	public ViewTime() {

	}

	public void printTimeInfo(Time time) {
		System.out.printf("%s\n", toFormatedString(time));
	}

	public String toFormatedString(Time time) {
			String firstZero;
			String hourStr;
			String minuteStr;
			String result;

			firstZero = new String("0");
			hourStr = String.format("%d", time.getHours());
			minuteStr = String.format("%d", time.getMinutes());

			if (hourStr.length() == 1) {
				hourStr = String.format("%s%s", firstZero, hourStr);
			}

			if (minuteStr.length() == 1) {
				minuteStr = String.format("%s%s", firstZero, minuteStr);
			}

			result = String.join(":", hourStr, minuteStr);

			return result;
		}
}

package by.godev.intro_class.simple_class.task6;

public class ViewTime {
	public static void printTimeInfo(Time time) {
		System.out.printf("%s\n", toFormatedString(time));
	}

	private static String toFormatedString(Time time) {
		String firstZero;
		String hourStr;
		String minuteStr;
		String secondStr;
		String result;

		firstZero = new String("0");
		hourStr = String.format("%d", time.getHours());
		minuteStr = String.format("%d", time.getMinutes());
		secondStr = String.format("%d", time.getSeconds());

		if (hourStr.length() == 1) {
			hourStr = String.format("%s%s", firstZero, hourStr);
		}

		if (minuteStr.length() == 1) {
			minuteStr = String.format("%s%s", firstZero, minuteStr);
		}

		if (secondStr.length() == 1) {
			secondStr = String.format("%s%s", firstZero, secondStr);
		}

		result = String.join(":", hourStr, minuteStr, secondStr);

		return result;
	}
}

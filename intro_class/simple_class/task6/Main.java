package by.godev.intro_class.simple_class.task6;

/*
 * 6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени 
 * и изменения его отдельных полей (час, минута, секунда)с проверкой допустимости вводимых значений. 
 * В случае недопустимых значений полей поле  устанавливается в значение 0.  
 * Создать методы изменения временина заданное количество часов, минут и секунд.
 * */

public class Main {

	public static void main(String[] args) {
		Time clock;
		Time clock2;

		clock = new Time();
		clock.setHours(0);
		clock.setMinutes(1);
		clock.setSeconds(5);
		clock2 = new Time(23, 59, 59);

		ViewTime.printTimeInfo(clock);
		ViewTime.printTimeInfo(clock2);

		clock2.setMinutes(0);
		ViewTime.printTimeInfo(clock2);

	}

}

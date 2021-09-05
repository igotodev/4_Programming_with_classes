package by.godev.intro_class.simple_class.task5;

public class DecimalCounterError {

	public static void error(String message) {
		System.out.printf("\nЧто-то пошло не так...\n" + message + "\nОперация не будет выполнена.\n\n");
	}

	public static void error() {
		System.out.printf("\nЧто-то пошло не так...\nОперация не будет выполнена.\n\n");
	}

	public static void fatalError(String message) {
		System.out.printf("\nЧто-то пошло уж очень не так...\n" + message + "\nАварийное завершение.\n\n");
		System.exit(1);
	}

	public static void fatalError() {
		System.out.printf("\nЧто-то пошло уж очень не так...\nАварийное завершение.\n\n");
		System.exit(1);
	}
}

package by.godev.intro_class.simple_class.task1;

/*
 * 1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
 * Добавьте метод, который находит сумму значений этих переменных, и метод, 
 * который находит наибольшее значение из этих двух переменных.
 * */

public class Test1 {
	private int a;
	private int b;

	public Test1() {
		this.a = 0;
		this.b = 0;
	}

	public void print() {
		System.out.printf("a = %d, b = %d\n", this.a, this.b);
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int sumAB() {
		return this.a + this.b;
	}

	public int maxAB() {
		if (this.a > this.b) {
			return this.a;
		}
		return this.b;
	}
	
	@Override
	public String toString() {
		return "Test1 [a=" + a + ", b=" + b + "]";
	}


}

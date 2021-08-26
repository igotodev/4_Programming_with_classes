package by.godev.intro_class.simple_class.task2;

/*
 * 2. Создйте класс Test2 двумя  переменными.  Добавьте конструктор с входными параметрами.  
 * Добавьте конструктор, инициализирующий члены класса по умолчанию. 
 * Добавьте set-и get-методы для полей экземпляра класса.
 * */

public class Test2 {
	private int a;
	private int b;

	public Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Test2() {
		this.a = 0;
		this.b = 0;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.a = b;
	}

	public int getA() {
		return this.a;
	}

	public int getB() {
		return this.b;
	}
	
	@Override
	public String toString() {
		return "Test2 [a=" + a + ", b=" + b + "]";
	}

}

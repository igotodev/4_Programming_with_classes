package by.godev.intro_class.simple_class.task7;

/*
 * 7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, 
 * вычисления площади, периметра и точки пересечения медиан.
 * */

public class Main {

	public static void main(String[] args) {
		TriangleView view;
		Triangle t1;
		Point a;
		Point b;
		Point c;

		a = new Point(1, 4);
		b = new Point(0, 0);
		c = new Point(0, 5);

		t1 = new Triangle(a, b, c);
		view = new TriangleView();

		view.printTriangleInfo(t1);

	}

}

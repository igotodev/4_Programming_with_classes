package by.godev.intro_class.simple_class.task7;

public class TriangleView {
	public TriangleView() {
		
	}

	public void printTriangleInfo(Triangle triangle) {
		Calculate calcTriangle;

		calcTriangle = new Calculate();

		System.out.printf("Треугольник с координатами вершин:\tA(%.2f;%.2f), B(%.2f;%.2f), C(%.2f;%.2f)\n",
				triangle.getPointA().getX(), triangle.getPointA().getY(), triangle.getPointB().getX(),
				triangle.getPointB().getY(), triangle.getPointC().getX(), triangle.getPointC().getY());
		System.out.printf("Периметр:\t\t\t\t%.2f\n", calcTriangle.perimeter(triangle));
		System.out.printf("Площадь:\t\t\t\t%.2f\n", calcTriangle.area(triangle));
		System.out.printf("Точка пересечения медиан:\t\tM(%.2f, %.2f)\n",
				calcTriangle.pointIntersectionOfMedians(triangle).getX(),
				calcTriangle.pointIntersectionOfMedians(triangle).getY());
	}
}

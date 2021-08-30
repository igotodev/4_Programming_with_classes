package by.godev.intro_class.simple_class.task7;

public class Calculate {

	public Calculate() {

	}

	public double perimeter(Triangle triangle) {
		return calculateSide(triangle.getPointA(), triangle.getPointB())
				+ calculateSide(triangle.getPointB(), triangle.getPointC())
				+ calculateSide(triangle.getPointC(), triangle.getPointA());
	}

	public double area(Triangle triangle) {
		double semiPerimeter;
		double square;
		double midA;
		double midB;
		double midC;

		semiPerimeter = perimeter(triangle) / 2;
		midA = semiPerimeter - calculateSide(triangle.getPointA(), triangle.getPointB());
		midB = semiPerimeter - calculateSide(triangle.getPointB(), triangle.getPointC());
		midC = semiPerimeter - calculateSide(triangle.getPointC(), triangle.getPointA());

		square = Math.sqrt(semiPerimeter * midA * midB * midC);

		return square;
	}

	public Point pointIntersectionOfMedians(Triangle triangle) {
		Point pointM;
		double mX;
		double mY;

		mX = (triangle.getPointA().getX() + triangle.getPointB().getX() + triangle.getPointC().getX()) / 3;
		mY = (triangle.getPointA().getY() + triangle.getPointB().getY() + triangle.getPointC().getY()) / 3;
		pointM = new Point(mX, mY);

		return pointM;
	}

	private double calculateSide(Point pointOne, Point pointTwo) {
		return Math.sqrt(
				Math.pow((pointOne.getX() - pointTwo.getX()), 2) + Math.pow((pointOne.getY() - pointTwo.getY()), 2));
	}

}

package by.godev.intro_class.simple_class.task7;

import java.util.Objects;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;

	public Triangle() {
		this.a.setX(0);
		this.a.setY(0);
		this.b.setX(0);
		this.b.setY(0);
		this.c.setX(0);
		this.c.setY(0);
	}

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void setPointA(Point a) {
		this.a = a;
	}

	public void setPointB(Point b) {
		this.b = b;
	}

	public void setPointC(Point c) {
		this.c = c;
	}

	public Point getPointA() {
		return this.a;
	}

	public Point getPointB() {
		return this.b;
	}

	public Point getPointC() {
		return this.c;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a, b, c);
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
		Triangle other = (Triangle) obj;
		return Objects.equals(a, other.a) && Objects.equals(b, other.b) && Objects.equals(c, other.c);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}

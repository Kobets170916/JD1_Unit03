package les08_07;

/*
 *  Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.
 */
public class TriangleLogic {

	private Triangle tr = new Triangle();

	public double Perimeter() {
		double p = (tr.getA() + tr.getB() + tr.getC());

		System.out.println(" p = " + p);
		return p;
	}

	public double Square() {
		double p = (tr.getA() + tr.getB() + tr.getC());

		double s = Math.sqrt((p / 2) * ((p / 2) - tr.getA()) * ((p / 2) - tr.getB()) * ((p / 2) - tr.getC()));

		System.out.println(" s = " + s);
		return s;
	}

	public double Medians() {
		double m = (tr.getA() + tr.getB() + tr.getC()) / 3;

		System.out.println(" m = " + m);
		return m;
	}

}

package les08_01;
/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
из этих двух переменных.
 * 
 */

public class Test1 {

	private int a;
	private int b;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getB() {
		return b;
	}

	public void printA(int a) {
		System.out.println("a = " + a);
	}
	public void printB(int b) {
		System.out.println("b = " + b);
	}

	public void sum() {
		int sum;
		sum = a + b;
		System.out.println("sum = " + sum);
	}

	public void bigger(int a, int b) {
		if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a < b");
		}
	}
}

package les08_02;
/*
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Test2 {
	private int a;
	private int b;

	public Test2() {
		a = 10;
		b = 100;
	}

	public Test2(int a, int b) {
		this.a = a;
		this.b = b;
	}

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

	public void print() {
		System.out.println("a = " + a + ", b = " + b);
	}

}
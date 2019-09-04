package les08_01;

/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
из этих двух переменных.
 * 
 */

public class Main {

	public static void main(String[] args) {
		Test1 t = new Test1();

		t.setA(10);
		t.setB(100);

		t.printA(t.getA());
		t.printB(t.getB());

		t.bigger(t.getA(), t.getB());

		t.sum();
	}

}
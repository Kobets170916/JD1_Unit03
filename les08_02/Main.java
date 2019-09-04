package les08_02;

/*
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Main {

	public static void main(String[] args) {
		
		Test2 t01 = new Test2();
		t01.print();

		Test2 t02 = new Test2(5, 50);
		t02.print();

	}

}
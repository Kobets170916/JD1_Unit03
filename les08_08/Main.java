package les08_08;

import java.util.List;
import java.util.Scanner;

/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Main {
	public static void main(String[] args) {
		Customers customers = new Customers(5);

		customers.add(new Customer(1, " фамилия1", " имя1", " отчество1", " адрес1", 12345678987L, 547852L));
		customers.add(new Customer(2, " фамилия2", " имя2", " отчество2", " адрес2", 22345678987L, 447852L));
		customers.add(new Customer(3, " фамилия3", " имя3", " отчество3", " адрес3", 32345678987L, 347852L));
		customers.add(new Customer(4, " фамилия4", " имя4", " отчество4", " адрес4", 42345678987L, 247852L));
		customers.add(new Customer(5, " фамилия5", " имя5", " отчество5", " адрес5", 52345678987L, 147852L));

		System.out.println("Вывод покупателей в алфавитном порядке:");
		List<Customer> customersNotSort = CustomersLogic.takeCustomers(customers);
		print(customersNotSort);

		System.out.println("Вывод всех клиентов в алфавитном порядке:");
		List<Customer> customersSort = CustomersLogic.sortCustomersByName(customers);
		print(customersSort);
		
		//434545641233 - 434545641238 -интервал для проверки
		System.out.println("Вывод всех клиентов по интервалу карты (12 чисел):");
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите значение min:");
		long min = sc.nextLong();
		System.out.println("Введите значение max:");
		long max = sc.nextLong();
		sc.close();	
		List<Customer> byNumberCreditCard = CustomersLogic.byNumberCreditCard(customers, min, max);
		print(byNumberCreditCard);

	}
		// вывод на консоль
	public static void print(List<Customer> customers) {
		for (Customer st : customers) {
			System.out.printf("Номер id: %d,  ", st.getId());
			System.out.printf("Фамилия: %s,  ", st.getLastName());
			System.out.printf("Имя: %s\n", st.getFirstName());
		}
	}
}


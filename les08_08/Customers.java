package les08_08;
/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

	public class Customers {
		private Customer[] customers;
		private int countCustomers;
		
		public Customers(int number) {
			customers = new Customer[number];
			countCustomers = 0;
		}
		
		public void add(Customer newCustomer) {	
			customers[countCustomers] = newCustomer;
			countCustomers++;
		}

		public Customer[] getCustomers() {
			return customers;
		}

		public void setCustomers(Customer[] customers) {
			this.customers = customers;
		}
		
	
}

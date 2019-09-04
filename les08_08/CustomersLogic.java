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

import java.util.ArrayList;
import java.util.List;

public class CustomersLogic {
		// получение массива трейнов
		public static List<Customer> takeCustomers(Customers customers) {
			Customer[] cust = customers.getCustomers();
			List<Customer> result = new ArrayList<Customer>();
			for (Customer st : cust) {
				result.add(st);
			}
			return result;
		}
		// сортировка по алфавиту
		public static List<Customer> sortCustomersByName(Customers customers) {
			Customer[] custom = customers.getCustomers();
			List<Customer> resultSort = new ArrayList<Customer>();

			for (int i = 0; i < custom.length; i++) {
				Customer max = custom[i];
				int max_i = i;
				for (int j = i + 1; j < custom.length; j++) {
					if (custom[j].getLastName().compareTo(max.getLastName()) < 0) {
						max = custom[j];
						max_i = j;
					}
				}
				if (i != max_i) {
					Customer tmp = custom[i];
					custom[i] = custom[max_i];
					custom[max_i] = tmp;
				}
			}
			for (Customer st : custom) {
				resultSort.add(st);
			}
			return resultSort;
		}

		// выдача по номеру карты
		public static List<Customer> byNumberCreditCard(Customers customers, long min, long max) {
			Customer[] custom = customers.getCustomers();
			List<Customer> resultByNumberCreditCard = new ArrayList<Customer>();
			for (int i = 0; i < custom.length; i++) {
				if ((custom[i].getNumberCreditCard() >= min) && (custom[i].getNumberCreditCard() <= max)) {
					resultByNumberCreditCard.add(custom[i]);
				}
			}
			return resultByNumberCreditCard;
		}
	}


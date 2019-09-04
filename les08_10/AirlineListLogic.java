package les08_10;

import java.util.ArrayList;
import java.util.List;

/*
 * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного
 */
public class AirlineListLogic {
	public List<Airline> takeAirLines(AirlineList airlines) {
		Airline[] air = airlines.getAirlineList();
		List<Airline> result = new ArrayList<Airline>();
		for (Airline st : air) {
			result.add(st);
		}
		return result;
	}

	// выдач для заданного пункта
	public List<Airline> byDestination(AirlineList airlines, String destination) {
		Airline[] air = airlines.getAirlineList();
		List<Airline> result = new ArrayList<Airline>();
		for (int i = 0; i < air.length; i++) {
			if ((air[i].getDestination().compareTo(destination) == 0)) {
				result.add(air[i]);
			}
		}
		return result;
	}

	public List<Airline> byDayOfTheWeek(AirlineList airlines, String day) {
		Airline[] air = airlines.getAirlineList();
		List<Airline> result = new ArrayList<Airline>();
		for (int i = 0; i < air.length; i++) {
			if ((air[i].getDayOfTheWeek().compareTo(day) == 0)) {
				result.add(air[i]);
			}
		}
		return result;
	}

	// выдач для заданного дня и времени
	public List<Airline> bydepartureTime(AirlineList airlines, String day, double time) {
		Airline[] air = airlines.getAirlineList();
		List<Airline> result = new ArrayList<Airline>();
		for (int i = 0; i < air.length; i++) {
			if ((air[i].getDepartureTime().compareTo(day) == 0)) {
				result.add(air[i]);
			}
		}
		return result;
	}
}

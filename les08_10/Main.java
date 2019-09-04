package les08_10;

import java.util.List;
import java.util.Scanner;

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
public class Main {

	public static void main(String[] args) {

		AirlineListLogic airlogic = new AirlineListLogic();
		AirlineList airlineList = new AirlineList(5);

		airlineList.add(new Airline("пункта назначения1", 1, "Airline", 15.20, "Monday"));
		airlineList.add(new Airline("пункта назначения2", 2, "Airline", 16.30, "Tuesday"));
		airlineList.add(new Airline("пункта назначения3", 3, "Airline", 17.40, "Wensday"));
		airlineList.add(new Airline("пункта назначения1", 1, "Airline", 18.50, "Thursday"));
		airlineList.add(new Airline("пункта назначения2", 2, "Airline", 19.00, "Monday"));

		System.out.println("вывести эти данные на консоль:");
		List<Airline> air = airlogic.takeAirlines(airLineList);
		print(air);

		System.out.println("вывести список рейсов для заданного пункта назначения:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Destination:");
		String au = sc.nextLine();
		List<Airline> air1 = airlogic.byDestination(airlineList, au);
		print(air1);

		System.out.println("вывести список рейсов для заданного дня недели:");
		System.out.println("Day:");
		String au1 = sc.nextLine();
		List<Airline> air2 = airlogic.byDay(airlineList, au1);
		print(air2);

		System.out.println("Вывод список рейсов для заданного дня недели, время вылета для которых больше заданного:");
		System.out.println("Day:");
		String au2 = sc.nextLine();
		System.out.println("Time:");
		double au3 = sc.nextDouble();
		List<Airline> air3 = airlogic.byDayAndTime(airlineList, au2, au3);
		print(air3);

		sc.close();
	}

	public static void print(List<Airline> airLines) {
		for (Airline st : airLines) {
			System.out.printf("Destination: %s,  ", st.getDestination());
			System.out.printf("NumFlight: %d,  ", st.getFlightNumber());
			System.out.printf("TypeAirplane: %s, ", st.getAircraftType());
			System.out.printf("TimeRun: %02.2f,  ", st.getDepartureTime());
			System.out.printf("DayOfWeek: %s\n", st.getDaysOfTheWeek());
		}
	}
}

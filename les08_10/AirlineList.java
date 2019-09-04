package les08_10;
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
public class AirlineList {
 private Airline[] airlineList;
	private int airlineListNum;
	
	public AirlineList(int num) {
		airlineList = new Airline[num];
		airlineListNum = 0;
	}
	public boolean add(Airline newAirline) {
		if (airlineListNum >= airlineList.length) {
			return false;
		}
		airlineList[airlineListNum] = newAirline;
		airlineListNum++;
		return false;
	}

	public Airline[] getAirlineList() {
		return airlineList;
	}
	public void setAirlineList(Airline[] airlineList) {
		this.airlineList = airlineList;
	}
	
	@Override
	public String toString() {
		return "airlineList = " + airlineList + "airlineListNum = " + airlineListNum;
	}
}

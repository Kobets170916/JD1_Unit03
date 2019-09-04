package les08_06;
/*
 *  Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное
количество часов, минут и секунд.
 */
public class Time {
	private int hour;
	private int min;
	private int sek;

	public Time() {
		super();
		hour = 0;
		min = 0;
		sek = 0;
	}

	public Time(int hour, int min, int sek) {
		super();
		this.hour = (hour >= 24) ? 0 : hour;
		this.min = (min >= 60) ? 0 : min;
		this.sek = (sek >= 60) ? 0 : sek;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = (hour >= 24) ? 0 : hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = (min >= 60) ? 0 : min;
	}

	public int getSek() {
		return sek;
	}

	public void setSek(int sek) {
		this.sek = (sek >= 60) ? 0 : sek;
	}

}

package les08_06;
/*
 *  Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное
количество часов, минут и секунд.
 */
public class TimeLogic {
	public Time changeTime(Time tm, int hour, int min, int sek) {

		int changeSek;
		int changeMin;
		int changeHour;

		changeSek = (tm.getSek() + sek) % 60;
		changeMin = (tm.getMin() + (tm.getSek() + sek) / 60 + min) % 60;
		changeHour = (tm.getHour() + ((tm.getMin() + (tm.getSek() + sek) / 60)) / 60 + hour) % 24;

		tm.setSek(changeSek);
		tm.setMin(changeMin);
		tm.setHour(changeHour);

		return tm;
	}
}

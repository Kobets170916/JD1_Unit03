package les08_06;
/*
 * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на заданное
количество часов, минут и секунд.
 * 
 */
public class Main {
	public static void main(String[] args) {

		Time tm = new Time(3, 5, 5);
		TimeLogic tmLog = new TimeLogic();

		tmLog.changeTime(tm, 1, 36, 42);

		System.out.println(tm.getHour() + " : " + tm.getMin() + " : " + tm.getSek());

	}

}
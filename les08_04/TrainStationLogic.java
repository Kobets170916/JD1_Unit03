package les08_04;
/*
 *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
быть упорядочены по времени отправления
 */
import java.util.ArrayList;
import java.util.List;

public class TrainStationLogic {

	public static List<Train> takeTrains(TrainStation trains) {// массив поезда
		Train[] tr = trains.getTrains();
		List<Train> result = new ArrayList<Train>();
		for (Train st : tr) {
			result.add(st);
		}
		return result;
	}

	public static Train[] sortTrainsNum(TrainStation trains) {// сортируем массив по номеру
		Train[] tr1 = trains.getTrains();

		for (int i = 0; i < tr1.length; i++) {
			Train max = tr1[i];
			int max_i = i;
			for (int j = i + 1; j < tr1.length; j++) {
				if (tr1[j].getNumTrain() < max.getNumTrain()) {
					max = tr1[j];
					max_i = j;
				}
			}
			if (i != max_i) {
				Train tmp = tr1[i];
				tr1[i] = tr1[max_i];
				tr1[max_i] = tmp;
			}
		}

		return tr1;
	}

	public static Train[] sortTrainsNameCity(TrainStation trains) {// сортируем по времени и месту
		Train[] tr1 = trains.getTrains();

		for (int i = 0; i < tr1.length; i++) {
			Train max = tr1[i];
			int max_i = i;
			for (int j = i + 1; j < tr1.length; j++) {
				if (tr1[j].getNameCity().compareTo(max.getNameCity()) < 0) {
					max = tr1[j];
					max_i = j;
				}
				if (tr1[j].getNameCity().compareTo(max.getNameCity()) == 0) {
					if (tr1[j].getTimeRun() < max.getTimeRun()) {
						max = tr1[j];
						max_i = j;
					}
				}
			}
			if (i != max_i) {
				Train tmp = tr1[i];
				tr1[i] = tr1[max_i];
				tr1[max_i] = tmp;
			}
		}

		return tr1;
	}

	public static void infoTrain(TrainStation trains, double num) {// номер поезда
		Train[] tr = trains.getTrains();
		for (Train t : tr) {
			if (num == t.getNumTrain()) {
				System.out.printf("Номер поезда: %d,  ", t.getNumTrain());
				System.out.printf("Пункт назначения: %s,  ", t.getNameCity());
				System.out.printf("Время отправления: %02.2f\n", t.getTimeRun());
			}
		}

	}

}
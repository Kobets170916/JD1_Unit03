package les08_04;
/*
 *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
быть упорядочены по времени отправления
 */
public class Train {
	public int n = 2;
	public String nameCity;
	public int numTrain;
	public double timeRun;

	public Train(String nameCity, int numTrain, double timeRun) {
		this.nameCity = nameCity;
		this.numTrain = numTrain;
		this.timeRun = timeRun;
	}

	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public int getNumTrain() {
		return numTrain;
	}

	public void setNumTrain(int numTrain) {
		this.numTrain = numTrain;
	}

	public double getTimeRun() {
		return timeRun;
	}

	public void setTimeRun(double timeRun) {
		this.timeRun = timeRun;
	}

	public static void printTrain(Train train) {
		System.out.printf("%s", train.getNameCity());
		System.out.printf("%d", train.getNumTrain());
		System.out.printf("%02.2f", train.getTimeRun());
	}

}

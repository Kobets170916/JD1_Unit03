package les08_04;
/*
 *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
быть упорядочены по времени отправления
 */
public class TrainStation {
	public Train[] trains;
	public int numTrains;
	
	public TrainStation(int number) {
		trains = new Train[number];
		numTrains = 0;
	}
	
	public boolean add(Train newTrain) {
		if (numTrains >= trains.length) {
			return false;
		}
		trains[numTrains] = newTrain;
		numTrains++;
		return false;
	}
	
	public Train[] getTrains() {
		return trains;
	}
	
	public void setTrains(Train[] trains) {
		this.trains = trains;
	}
	


}

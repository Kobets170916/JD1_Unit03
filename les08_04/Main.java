package les08_04;
/*
 *  Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте
данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам
поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте
возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны
быть упорядочены по времени отправления
 */
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		TrainStation trains = new TrainStation(3);
		
		trains.add(new Train("Gomel", 1, 9.00));
		trains.add(new Train("Mozir", 2, 11.30));
		trains.add(new Train("Minsk", 3, 12.15));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Выберите номер поезда:");
		double x = sc.nextDouble();
		sc.close();
		TrainStationLogic.infoTrain(trains, x);

		System.out.println("Все поезда:");
		List<Train> trainsNotSort = TrainStationLogic.takeTrains(trains);
		printTrains(trainsNotSort);
		
		System.out.println("Сортируем по номеру:");
		Train[] sortNum = TrainStationLogic.sortTrainsNum(trains);
		printTrains1(sortNum);
		
		System.out.println("Сортируем по времени и месту:");
		Train[] sortNameCity = TrainStationLogic.sortTrainsNameCity(trains);
		printTrains1(sortNameCity);
		
	}

	public static void printTrains(List<Train> trains) {
		for (Train st : trains) {
			System.out.printf("Номер поезда: %d,  ", st.getNumTrain());
			System.out.printf("Пункт назначения: %s,  ", st.getNameCity());
			System.out.printf("Время отправления: %02.2f\n", st.getTimeRun());
		}
	}
	
	public static void printTrains1(Train[] trains) {
		for (Train st : trains) {
			System.out.printf("Номер поезда: %d,  ", st.getNumTrain());
			System.out.printf("Пункт назначения: %s,  ", st.getNameCity());
			System.out.printf("Время отправления: %02.2f\n", st.getTimeRun());
		}
	}

}

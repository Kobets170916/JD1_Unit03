package les08_05;
/*
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на
единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class Count {

	private int minCount;
	private int maxCount;
	private int currentCount;

	public Count() {

	}

	public Count(int minCount, int maxCount, int currentCount) {
		this.minCount = minCount;
		this.maxCount = maxCount;
		this.currentCount = currentCount;

	}

	public void increase() {
		currentCount++;
	}

	public void decrease() {
		currentCount--;
	}

	public int getMinCount() {
		return minCount;
	}

	public void setMinCount(int minCount) {
		this.minCount = minCount;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

	//public int getCurrentCount() {
	//	return currentCount;
	//}

	public void setCurrentCount(int currentValue) {
		this.currentCount = currentCount;
	}

	public int get_currentCount() {
		return currentCount;
	}

}
package les08_08;
/*
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Customer {
	private int id;
	private String lastName;
	private String firstName;
	private String middleName;
	private String adress;
	private long numberCreditCard;
	private long numberBankCount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public long getNumberCreditCard() {
		return numberCreditCard;
	}
	
	public void setNumberCreditCard(long numberCreditCard) {
		this.numberCreditCard = numberCreditCard;
	}

	public long getNumberBankCount() {
		return numberBankCount;
	}

	public void setNumberBankCount(long numberBankCount) {
		this.numberBankCount = numberBankCount;
	}

	public Customer(int id, String lastName, String firstName, String middleName, String adress, long numberCreditCard,
			long numberBankCount) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.adress = adress;
		this.numberCreditCard = numberCreditCard;
		this.numberBankCount = numberBankCount;
	}

	@Override
	public String toString() {
		return "Customer: id =" + id + ", lastName =" + lastName + ", firstName = " + firstName + ", middleName ="
				+ middleName + ",adress = " + adress + ", numberCreditCard = " + numberCreditCard
				+ ", numberBankCount =" + numberBankCount;
	}

}

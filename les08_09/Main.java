package les08_09;
import java.util.List;
import java.util.Scanner;

/*
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class Main {
	public static void main(String[] args) {
		BookList bookList = new BookList(5);

		bookList.add(new Book(5, "name 1", "A", "print1", 2019, 200, 5, "Binding5"));
		bookList.add(new Book(2, "name 2", "B", "print1", 2000, 100, 7, "Binding2"));
		bookList.add(new Book(3, "name 3", "C", "print2", 2018, 250, 3, "Binding3"));
		bookList.add(new Book(1, "name 4", "D", "print3", 2015, 250, 50, "Binding5"));
		bookList.add(new Book(4, "name 5", "D", "print5", 2015, 100, 20, "Binding3"));

		System.out.println("вывести эти данные на консоль:");
		List<Book> bookListAll = BookListLogic.takeBooksList(bookList);
		print(bookListAll);

		
		System.out.println("Вывод списокa книг заданного автора на консоль:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите автора:");
		String author = sc.nextLine();
		List<Book> xAuthor = BookListLogic.xAuthor(bookList, author);
		print(xAuthor);

		
		System.out.println("Вывод списокa книг заданного издательства на консоль:");

		System.out.println("Введите издательство:");
		String publish = sc.nextLine();
		List<Book> xPublish = BookListLogic.xPublish(bookList, publish);
		print(xPublish);

		
		System.out.println("Вывод списокa книг заданного года на консоль:");
		System.out.println("Введите год:");
		int year = sc.nextInt();
		List<Book> xYear = BookListLogic.xYear(bookList, year);
		print(xYear);
		sc.close();
	}

	public static void print(List<Book> book) {
		for (Book st : book) {
			System.out.printf("Номер id: %d, ", st.getId());
			System.out.printf("Название книги: %s,  ", st.getName());
			System.out.printf("Автор: %s,  ", st.getAuthor());
			System.out.printf("Издательство: %s,  ", st.getPublishHouse());
			System.out.printf("Год публикации: %d,  ", st.getYearOfPublication());
			System.out.printf("Количество страниц: %d,  ", st.getNumberOfPages());
			System.out.printf("Цена: %.2f $,  ", st.getPrice());
			System.out.printf("Тип переплета: %s;\n", st.getTypeOfBinding());
		}
	}
}

package les08_09;
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
import java.util.ArrayList;
import java.util.List;

public class BookListLogic {
	
//Задать критерии выбора данных
	public static List<Book> takeBooksList(BookList book) {

		Book[] books = bookList.getBookList();
		List<Book> result = new ArrayList<Book>();
		for (Book st : books) {
			result.add(st);
		}
		return result;
	}

	// a) список книг заданного автора;
	public static List<Book> xAuthor(BookList bookList, String author) {

		List<Book> resultAuthor = new ArrayList<Book>();
		Book[] book = bookList.getBookList();
		for (int i = 0; i < book.length; i++) {
			if (book[i].getAuthor().compareTo(author) == 0) {

				resultAuthor.add(book[i]);

			}
		}
		return resultAuthor;
	}

	// b) список книг, выпущенных заданным издательством;
	public static List<Book> xPublish(BookList bookList, String publish) {
		Book[] book = bookList.getBookList();
		List<Book> resultPublish = new ArrayList<Book>();
		for (int i = 0; i < book.length; i++) {
			if (book[i].getPublishHouse().compareTo(publish) == 0) {
				resultPublish.add(book[i]);
			}
		}
		return resultPublish;
	}

	// c) список книг, выпущенных после заданного года.
	public static List<Book> xYear(BookList bookList, int year) {
		Book[] book = bookList.getBookList();
		List<Book> resultYear = new ArrayList<Book>();
		for (int i = 0; i < book.length; i++) {
			if (book[i].getYearOfPublication() > year) {
				resultYear.add(book[i]);
			}
		}
		return resultYear;

	}

}
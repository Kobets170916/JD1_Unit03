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

import java.util.Arrays;

//Создать второй класс
public class BookList {
	
	// агрегирующий массив типа Book
		private Book[] bookList;
		private int bookListCount;
		
		public BookList() {
			bookList = new Book[bookListCount];
			bookListCount = 0;
		}
		
		//конструкторами и методами
		public void add(Book newBook) {	
			bookList[bookListCount] = newBook;
			bookListCount++;
		}

		public Book[] getBookList() {
			return bookList;
		}

		public void setBookList(Book[] bookList) {
			this.bookList = bookList;
		}

		@Override
		public String toString() {
			return "BookList [bookList=" + Arrays.toString(bookList) + ", bookListCount=" + bookListCount + "]";
		}
		
	}


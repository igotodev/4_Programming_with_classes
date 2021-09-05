package by.godev.intro_class.simple_class.task9;

/*
 * 9. Создать класс Book, спецификация которого приведена ниже. 
 * Определить конструкторы, set-и get-методы и метод  toString(). 
 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. 
 * Задать критерии выбора данных и вывести эти данные на консоль. 
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 
 * Найти и вывести: 
 * a) список книг заданного автора; 
 * b) список книг, выпущенных заданным издательством; 
 * c) список книг, выпущенных после заданного года.
 * */

public class Main {

	public static void main(String[] args) {
		Book[] books;
		OurBooks collection;
		BookSearch search;
		ViewBooks view;

		books = new Book[5];
		collection = new OurBooks();
		search = new BookSearch();
		view = new ViewBooks();

		books[0] = new Book("Лучшая книга", "Крутой автор", "Питер", 2021, 1205, 92.50, "Твердый");
		books[1] = new Book("Отличная книга", "Другой автор", "Покет", 2020, 701, 57.00, "Мягкий");
		books[2] = new Book("Хорошая книга", "Серьезный автор", "Питер", 2021, 1021, 80.20, "Твердый");
		books[3] = new Book("Неплохая книга", "Молодой автор", "Покет", 2018, 505, 30.20, "Мягкий");
		books[4] = new Book("Книга как книга", "Автор как автор", "Эксмо", 2019, 400, 35.20, "Твердый");
		collection.setAllBooks(books);

		System.out.printf("\nРезультат поиска по автору:\n");
		view.printBookCollection(search.searchByAuthor(collection, "Другой автор"));

		System.out.printf("\nРезультат поиска по издательству:\n");
		view.printBookCollection(search.searchByPublisher(collection, "Питер"));

		System.out.printf("\nРезультат поиска книг после заданного года:\n");
		view.printBookCollection(search.searchByBooksPublishedAfter(collection, 2020));

		// view.printBook(books[0]);
		// view.printBookCollection(collection);

	}

}

package by.godev.intro_class.simple_class.task9;

public class BookSearch {
	public BookSearch() {

	}

	public OurBooks searchByAuthor(OurBooks allBooks, String author) {
		OurBooks result;

		result = new OurBooks();

		for (Book b : allBooks.getAllBooks()) {
			if (b.getAuthor().equals(author)) {
				result.addBook(b);
			}
		}

		return result;
	}

	public OurBooks searchByPublisher(OurBooks allBooks, String publisher) {
		OurBooks result;

		result = new OurBooks();

		for (Book b : allBooks.getAllBooks()) {
			if (b.getPublisher().equals(publisher)) {
				result.addBook(b);
			}
		}

		return result;
	}

	public OurBooks searchByBooksPublishedAfter(OurBooks allBooks, int publishedYear) {
		OurBooks result;

		result = new OurBooks();

		for (Book b : allBooks.getAllBooks()) {
			if (b.getYearOfPublication() >= publishedYear) {
				result.addBook(b);
			}
		}

		return result;
	}

}

package by.godev.intro_class.simple_class.task9;

public class ViewBooks {
	public ViewBooks() {

	}

	public void printBook(Book b) {
		System.out.println("--------------------------------------------");
		System.out.printf("ID: \t\t\t%s\n", b.getId());
		System.out.printf("Название: \t\t%s\n", b.getTitle());
		System.out.printf("Aвтор(ы): \t\t%s\n", b.getAuthor());
		System.out.printf("Издательство: \t\t%s\n", b.getPublisher());
		System.out.printf("Год издания: \t\t%d\n", b.getYearOfPublication());
		System.out.printf("Тип переплета: \t\t%s\n", b.getCover());
		System.out.printf("Количество страниц: \t%d\n", b.getNumberOfPages());
		System.out.printf("Цена: \t\t\t%.2f руб.\n", b.getPrice());
	}

	public void printBookCollection(OurBooks books) {
		for (Book b : books.getAllBooks()) {
			printBook(b);
		}
	}
}

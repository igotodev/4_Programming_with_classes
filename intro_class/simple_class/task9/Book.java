package by.godev.intro_class.simple_class.task9;

import java.util.Objects;

//id, title, author, publisher, yearOfPublication, numberOfPages, price, cover. 
public class Book {
	private String id;
	private String title;
	private String author;
	private String publisher;
	private int yearOfPublication;
	private int numberOfPages;
	private double price;
	private String cover;

	public Book() {
		this.id = Generation.createID_L(14);
		this.title = new String("unknown");
		this.author = new String("unknown");
		this.publisher = new String("unknown");
		this.yearOfPublication = 0;
		this.numberOfPages = 0;
		this.price = 0.0;
		this.cover = new String("unknown");
	}

	public Book(String title, String author, String publisher, int yearOfPublication, int numberOfPages, double price,
			String cover) {
		this.id = Generation.createID_L(14);
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.yearOfPublication = yearOfPublication;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.cover = cover;
	}

	public String getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearOfPublication() {
		return this.yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}

	public int getNumberOfPages() {
		return this.numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCover() {
		return this.cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, cover, numberOfPages, publisher, title, yearOfPublication);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(cover, other.cover)
				&& numberOfPages == other.numberOfPages && Objects.equals(publisher, other.publisher)
				&& Objects.equals(title, other.title) && yearOfPublication == other.yearOfPublication;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", title=" + title + ", author=" + author
				+ ", publisher=" + publisher + ", yearOfPublication=" + yearOfPublication + ", numberOfPages="
				+ numberOfPages + ", price=" + price + ", cover=" + cover + "]";
	}

}

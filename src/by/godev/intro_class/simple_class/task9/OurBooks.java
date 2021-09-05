package by.godev.intro_class.simple_class.task9;

import java.util.Arrays;

public class OurBooks {
	private Book[] allBooks;

	public OurBooks() {
		this.allBooks = new Book[] {};
	}

	public Book[] getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(Book[] allBooks) {
		this.allBooks = allBooks;
	}

	public void addBook(Book b) {
		this.allBooks = Arrays.copyOf(this.getAllBooks(), this.getAllBooks().length + 1);
		this.allBooks[this.allBooks.length - 1] = b;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(allBooks);
		return result;
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
		OurBooks other = (OurBooks) obj;
		return Arrays.equals(allBooks, other.allBooks);
	}

	@Override
	public String toString() {
		return "OurBooks [allBooks=" + Arrays.toString(allBooks) + "]";
	}

}

package by.godev.intro_class.aggregation.task1;

import java.util.Objects;

public class Word {
	private String word;

	public Word() {
		this.word = new String("");
	}

	public Word(String word) {
		this.word = word;
	}

	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int hashCode() {
		return Objects.hash(word);
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
		Word other = (Word) obj;
		return Objects.equals(word, other.word);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [word=" + word + "]";
	}

}

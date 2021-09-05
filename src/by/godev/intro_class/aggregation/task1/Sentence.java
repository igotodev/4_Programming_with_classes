package by.godev.intro_class.aggregation.task1;

import java.util.Arrays;

public class Sentence {
	private Word[] words;

	public Sentence() {
		this.words = new Word[] {};
	}

	public Sentence(Word[] words) {
		this.words = words;
	}

	public Word[] getWords() {
		return this.words;
	}

	public void setWords(Word[] words) {
		this.words = words;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(words);
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
		Sentence other = (Sentence) obj;
		return Arrays.equals(words, other.words);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [words=" + Arrays.toString(words) + "]";
	}
}

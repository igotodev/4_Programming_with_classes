package by.godev.intro_class.aggregation.task1;

import java.util.Arrays;
import java.util.Objects;

public class Text {
	private Sentence[] sentences;
	private Sentence title;

	public Text() {
		this.title = new Sentence();
		this.sentences = new Sentence[] {};
	}

	public Text(Sentence title, Sentence[] sentences) {
		this.title = title;
		this.sentences = sentences;
	}

	public Sentence getTitle() {
		return this.title;
	}

	public void setTitle(Sentence title) {
		this.title = title;
	}

	public Sentence[] getSentences() {
		return this.sentences;
	}

	public void setSentences(Sentence[] sentences) {
		this.sentences = sentences;
	}

	public void addText(Sentence[] sentences) {
		int count;

		count = this.sentences.length;
		this.sentences = Arrays.copyOf(this.sentences, this.sentences.length + sentences.length);

		for (int i = 0; i < sentences.length; i++) {
			this.sentences[count] = sentences[i];
			count++;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(sentences);
		result = prime * result + Objects.hash(title);
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
		Text other = (Text) obj;
		return Arrays.equals(sentences, other.sentences) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [sentences=" + Arrays.toString(sentences) + ", title=" + title + "]";
	}

}

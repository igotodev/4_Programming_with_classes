package by.godev.intro_class.aggregation.task1;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 * */

public class Main {

	public static void main(String[] args) {
		ViewText view;
		Text text;
		Word titleWord1;
		Word titleWord2;
		Word[] titleWords;
		Word[] startWords;
		Word[] addedWords;
		Sentence sentenceTitle;
		Sentence startSentence;
		Sentence addedSentence;
		Sentence[] textSentences;
		Sentence[] addedTextSentences;

		view = new ViewText();

		titleWords = new Word[2];
		titleWord1 = new Word("Привет");
		titleWord2 = new Word("мир");
		titleWords[0] = titleWord1;
		titleWords[1] = titleWord2;
		sentenceTitle = new Sentence(titleWords);

		startWords = new Word[3];
		startWords[0] = new Word("Привет");
		startWords[1] = new Word("о");
		startWords[2] = new Word("дивный");
		startSentence = new Sentence(startWords);

		addedWords = new Word[2];
		addedWords[0] = new Word("новый");
		addedWords[1] = new Word("мир");
		addedSentence = new Sentence(addedWords);

		textSentences = new Sentence[] { startSentence };
		text = new Text(sentenceTitle, textSentences);

		addedTextSentences = new Sentence[] { addedSentence };
		text.addText(addedTextSentences);

		view.printText(text);
	}

}

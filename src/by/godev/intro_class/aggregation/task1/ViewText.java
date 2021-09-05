package by.godev.intro_class.aggregation.task1;

public class ViewText {
	public ViewText() {

	}

	public void printText(Text t) {
		System.out.printf("\t\t\t");
		for (Word wordTitle : t.getTitle().getWords()) {
			System.out.printf("%s ", wordTitle.getWord());
		}
		System.out.printf("\n\n\t");
		for (Sentence s : t.getSentences()) {
			for (Word wordText : s.getWords())
				System.out.printf("%s ", wordText.getWord());
		}
	}
}

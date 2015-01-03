package wordWrap;

public class Wrap {

	private int lineLength;
	private String word;

	public Wrap(String word, int length) {
		this.word = word;
		this.lineLength = length;
	}

	public String wrapper() {
		if (noWord()) {
			return "";
		} else if (longWord()) {
			return longWordSplit();
		}
		return word;
	}

	private boolean longWord() {
		return word.length() > lineLength;
	}

	private boolean noWord() {
		return word == null || word.length() < 1;
	}

	private String longWordSplit() {
		String newWord;
		newWord = word.substring(0, lineLength);
		newWord += "\n";
		newWord += word.substring(lineLength, word.length()).trim();
		return newWord;
	}

}

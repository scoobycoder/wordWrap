package wordWrap;

public class Wrap {

	public String wrapper(String word, int lineLength) {
		String newWord = word;
		if (newWord == null || newWord.length() < 1) {
			return "";
		} else if (newWord.length() > lineLength) {
			newWord = word.substring(0, lineLength);
			newWord += "\n";
			newWord += word.substring(lineLength, word.length()).trim();

			return newWord;
		}
		return newWord;
	}

}

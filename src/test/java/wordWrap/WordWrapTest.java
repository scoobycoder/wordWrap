package wordWrap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WordWrapTest {

	private Wrap wrap;

	@Before
	public void setup() {
		wrap = new Wrap();
	}
	
	@Test
	public void wrapShouldReturnBlankForNull() {
		assertEquals("", wrap.wrapper(null, 1));
	}

	@Test
	public void wrapShouldReturnBlankForBlank() {
		assertEquals("", wrap.wrapper("", 1));
	}
	
	@Test
	public void wrapShouldReturnOneLetterWordForOneLetterWord() {
		assertEquals("w", wrap.wrapper("w", 1));
	}
	
	@Test
	public void wrapShouldNotWrapForTwoLetterWrap() {
		assertEquals("ww", wrap.wrapper("ww", 2));
	}
	
	@Test
	public void wrapShouldWrapForTwoLetterWordIfOneLengthSentance() {
		assertEquals("w\nw", wrap.wrapper("ww", 1));
	}
	
	@Test
	public void shouldWrapForThreeLetterWordIfOneLengthSentence() {
		assertEquals("ww\nw", wrap.wrapper("www", 2));
	}
	
	@Test
	public void shouldWrapOnOneSpace() {
		assertEquals("www\nw", wrap.wrapper("www w",3));
	}
	
}

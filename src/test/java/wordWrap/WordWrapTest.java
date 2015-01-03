package wordWrap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class WordWrapTest {

	private Wrap wrap;

	@Test
	public void wrapShouldReturnBlankForNull() {
		wrap = new Wrap(null, 1);
		assertEquals("", wrap.wrapper());
	}

	@Test
	public void wrapShouldReturnBlankForBlank() {
		wrap = new Wrap("", 1);
		assertEquals("", wrap.wrapper());
	}
	
	@Test
	public void wrapShouldReturnOneLetterWordForOneLetterWord() {
		wrap = new Wrap("w", 1);
		assertEquals("w", wrap.wrapper());
	}
	
	@Test
	public void wrapShouldNotWrapForTwoLetterWrap() {
		wrap = new Wrap("ww", 2);
		assertEquals("ww", wrap.wrapper());
	}
	
	@Test
	public void wrapShouldWrapForTwoLetterWordIfOneLengthSentance() {
		wrap = new Wrap("ww", 1);
		assertEquals("w\nw", wrap.wrapper());
	}
	
	@Test
	public void shouldWrapForThreeLetterWordIfOneLengthSentence() {
		wrap = new Wrap("www", 2);
		assertEquals("ww\nw", wrap.wrapper());
	}
	
	@Test
	public void shouldWrapOnOneSpace() {
		wrap = new Wrap("www w", 3);
		assertEquals("www\nw", wrap.wrapper());
	}
	
	@Test @Ignore
	public void shouldWrapWithSpaceAndLongWord() {
		wrap = new Wrap("www wwww", 3);
		assertEquals("www\nwww\nw", wrap.wrapper());
	}
	
}

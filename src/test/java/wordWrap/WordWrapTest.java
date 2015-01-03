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
		assertEquals("", wrap.wrapper(null));
	}

	@Test
	public void wrapShouldReturnBlankForBlank() {
		assertEquals("", wrap.wrapper(""));
	}
	
	@Test
	public void wrapShouldReturnOneLetterWordForOneLetterWord() {
		assertEquals("w", wrap.wrapper("w"));
	}
	
}

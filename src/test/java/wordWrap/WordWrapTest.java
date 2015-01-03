package wordWrap;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrapTest {

	@Test
	public void wrapShouldReturnBlankForNull() {
		Wrap wrap = new Wrap();
		assertEquals("", wrap.wrapper(null));
	}
	
}

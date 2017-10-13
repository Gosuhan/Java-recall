package co.simplon.recall;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExempleJUnitTest {

	@Test
	public void helloWorld() {
		
		assertEquals("Hello World", ExempleJUnit.helloWorld(""));
		assertEquals("Hello Davy", ExempleJUnit.helloWorld("Davy"));
		
	}

}

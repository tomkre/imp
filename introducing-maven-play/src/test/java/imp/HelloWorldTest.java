package imp;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
	
	private final PrintStream origOut = System.out;
	
	@Before
	public void setUp() {
		System.setOut(new PrintStream(outStream));
	}
	
	@Test
	public void testSayHello() {
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
		assertEquals("Hello World", outStream.toString());
	}
	
	@After
	public void cleanUp() {
		System.setOut(origOut);
	}
	
}

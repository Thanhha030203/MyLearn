package testmaven.testmaven;
import org.junit.Test;

import junit.framework.TestCase;
public class AppTest extends TestCase{
	public AppTest(String testName) {
		super(testName);
	}
	public void testApp() {
		assertTrue(true);
	}
	
	@Test
	public void testIsEventNumber2() {
		App demo1 = new App();
		boolean result = demo1.isEventNumber(5);
		assertTrue(result);
	}
	@Test
	public void testIsEventNumber4() {
		App demo1 = new App();
		boolean result = demo1.isEventNumber(4);
		assertTrue(result);
	}
	
}

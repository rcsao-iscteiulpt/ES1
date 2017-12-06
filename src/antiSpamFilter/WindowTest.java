package antiSpamFilter;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class WindowTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Rule
	  public final ExpectedException exception = ExpectedException.none();

	@Test
	public void testMain1() {
		Window w = new Window();
		w.main(null);
			
	}
	
	@Test
	public void testMain2() {
		Window w = new Window();
		exception.expect(Exception.class);
		w.main(null);	
	}

	@Test
	public void testWindow() {
		Window w = new Window();
	}

}

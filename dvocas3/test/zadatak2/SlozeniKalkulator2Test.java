package zadatak2;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SlozeniKalkulator2Test {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	private SlozeniKalkulator2 instance;

	@Before
	public void setUp() throws Exception {
		instance = new SlozeniKalkulator2();
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}

	@Test(timeout = 2000)
	public void metoda_Ispisi55Do0() {
		instance.ispisi55Do0();

		String ocekivaniIspis = "";

		for (int i = 55; i >= 0; i--)
			ocekivaniIspis = ocekivaniIspis + i + System.lineSeparator();

		assertEquals("NE ispisuju se brojevi od 55 do 0", ocekivaniIspis.trim(), outContent.toString().trim());
	}

	@Test(timeout = 2000)
	public void metoda_faktorijel() {
		assertEquals("Za unet broj N = 6 metoda ne vraca 720", 720, SlozeniKalkulator2.faktorijel(6));
	}

	@Test(timeout = 2000)
	public void metoda_ABN() {
		assertEquals("Za unete brojeve A = 2, B = 4 i N = 3 metoda ne vraca 216", 216.0, SlozeniKalkulator2.ABN(2, 4, 3), 0.001);
	}

}

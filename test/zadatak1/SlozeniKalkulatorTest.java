package zadatak1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SlozeniKalkulatorTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	private SlozeniKalkulator instance;

	@Before
	public void setUp() throws Exception {
		instance = new SlozeniKalkulator();
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}

	@Test
	public void konstanta_PI() {
		assertEquals("Vrednost konstante nije 3.14", 3.14, SlozeniKalkulator.PI, 0.001);
	}
	
	@Test
	public void metoda_podeliDoubleDouble() {
		assertEquals("Kad se podele 6.4 i 2.0 rezultat nije 3.2", 3.2, instance.podeli(6.4, 2.0), 0.001);
	}

	@Test
	public void metoda_podeliIntInt() {
		assertEquals("Kad se podele 5 i 2 rezultat nije 2", 2, instance.podeli(5, 2));
	}

	@Test
	public void metoda_podeliMod() {
		assertEquals("Kad se podele 8 i 3 ostatak nije 2", 2, instance.podeliMod(8, 3));
	}
	
	@Test
	public void metoda_izracunajObimKruga() {
		double r = 5.0;
        double ocekivanObim = 2 * r * instance.PI;
		assertEquals("Kad se unese 5 za poluprecnik kruga obim nije 31.4",ocekivanObim, instance.izracunajObimKruga(5.0),0.001);
	}
	
	@Test
	public void metoda_izracunajPovrsinuKruga() {
		double r = 5.0;
        double ocekivanaPovrsina = r * r * instance.PI;
		assertEquals("Kad se unese 5 za poluprecnik kruga povrsina nije 78.5",ocekivanaPovrsina, instance.izracunajPovrsinuKruga(5.0),0.001);
	}

	@Test(timeout = 2000)
	public void metoda_ispisi50Puta() {
		instance.ispisi50Puta(12);

		String ocekivaniIspis = "";

		for (int i = 1; i <= 50; i++)
			ocekivaniIspis = ocekivaniIspis + "12" + System.lineSeparator();

		assertEquals("Ako se unese broj 12, NE ispisuje se 50 puta", ocekivaniIspis.trim(), outContent.toString().trim());
	}

	@Test(timeout = 2000)
	public void metoda_ispisi1Do100() {
		instance.ispisi1Do100();

		String ocekivaniIspis = "";

		for (int i = 1; i <= 100; i++)
			ocekivaniIspis = ocekivaniIspis + i + System.lineSeparator();

		assertEquals("NE ispisuju se brojevi od 1 do 100", ocekivaniIspis.trim(), outContent.toString().trim());
	}

	@Test(timeout = 2000)
	public void metoda_suma() {
		assertEquals("Za unet broj 12 metoda ne vraca sumu 78", 78, SlozeniKalkulator.suma(12));
	}

	@Test(timeout = 2000)
	public void metoda_stepenX() {
		assertEquals("Za unete brojeve X = 3.0 i N = 4 metoda ne vraca 81", 81.0, SlozeniKalkulator.stepenX(3.0, 4),
				0.001);
	}

	@Test(timeout = 2000)
	public void metoda_minStepenDva() {
		assertEquals("Za unet broj 55 metoda ne vraca 64", 64, SlozeniKalkulator.minStepenDva(55));

	}

	@Test(timeout = 2000)
	public void metoda_deliSaDva() {
		SlozeniKalkulator.deliSaDva(33);

		String ocekivaniIspis = "16" + System.lineSeparator() + "8" + System.lineSeparator() + "4" + System.lineSeparator() + "2"
				+ System.lineSeparator() + "1";

		assertEquals("Za unet broj 33 NE ispisuju se brojevi 16 8 4 2 1", ocekivaniIspis.trim(), outContent.toString().trim());
	}

}

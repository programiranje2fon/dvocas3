package zadatak1;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SlozeniKalkulatorTest {

	SlozeniKalkulator instance;

	@Before
	public void setUp() throws Exception {
		instance = new SlozeniKalkulator();
	}

	@After
	public void tearDown() throws Exception {
		instance = null;
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

	@Test(timeout = 2000)
	public void testIspisi50Puta() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			instance.ispisi50Puta(12);

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			String s = "";

			for (int i = 1; i <= 50; i++)
				s = s + "12" + System.lineSeparator();

			assertEquals("Ako se unese broj 12, NE ispisuje se 50 puta", s.trim(), ispis.trim());
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}

	}

	@Test(timeout = 2000)
	public void metoda_ispisi1Do100() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			instance.ispisi1Do100();

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			String s = "";

			for (int i = 1; i <= 100; i++)
				s = s + i + System.lineSeparator();

			assertEquals("NE ispisuju se brojevi od 1 do 100", s.trim(), ispis.trim());
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

	@Test(timeout = 2000)
	public void metoda_suma() {
		assertEquals("Za unet broj 12 metoda ne vraca sumu 78", 78, SlozeniKalkulator.suma(12));
	}

	@Test(timeout = 2000)
	public void testStepenX() {
		assertEquals("Za unete brojeve X = 3.0 i N = 4 metoda ne vraca 81", 81.0, SlozeniKalkulator.stepenX(3.0, 4),
				0.001);
	}

	@Test(timeout = 2000)
	public void testMinStepenDva() {
		assertEquals("Za unet broj 55 metoda ne vraca 64", 64, SlozeniKalkulator.minStepenDva(55));

	}

	@Test(timeout = 2000)
	public void metoda_deliSaDva() {
		PrintStream pom = System.out;
		try {
			// Otvoren outputstream za redirekciju System.out
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			System.out.flush();
			// Redirekcija
			System.setOut(new PrintStream(buffer));

			SlozeniKalkulator.deliSaDva(33);

			System.out.flush();

			// Preuzimanje ispisa metode na ekranu
			String ispis = buffer.toString();

			// Vracanje System.out na staro
			System.setOut(pom);

			String s = "16" + System.lineSeparator() + "8" + System.lineSeparator() + "4" + System.lineSeparator() + "2"
					+ System.lineSeparator() + "1";

			assertEquals("Za unet broj 33 NE ispisuju se brojevi 16 8 4 2 1", s.trim(), ispis.trim());
		} catch (Exception e) {
			System.setOut(pom);
			e.printStackTrace();
		}
	}

}

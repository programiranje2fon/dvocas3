package zadatak1;

public class ProbaSlozeniKalkulator {
	public static void main(String[] args) {
		SlozeniKalkulator k1 = new SlozeniKalkulator();
		
		System.out.println(k1.podeli(7.5, 1.3));
		System.out.println(k1.podeli(7,2));
		System.out.println(k1.podeliMod(7,2));
		
		System.out.println(k1.izracunajPovrsinuKruga(5.0));
		
		//k1.ispisi50puta(5);
		
		//k1.ispisi1do100();
		
		System.out.println(SlozeniKalkulator.suma(5));
		System.out.println(SlozeniKalkulator.stepenX(2.5,3));
		System.out.println(SlozeniKalkulator.minStepenDva(5));
		
		SlozeniKalkulator.deliSaDva(33);
		
		
		}

}

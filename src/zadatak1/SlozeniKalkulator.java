package zadatak1;

public class SlozeniKalkulator {
	
	static final double PI=3.14;
	
	double podeli(double x,double y) {
		return x/y;
	}
	
	int podeli(int x,int y) {
		return x/y;
	}
	
	int podeliMod(int x,int y) {
		return x%y;
	}
	
	double izracunajObimKruga(double r) {
		double obim=2*r*PI;
		return obim;
	}
	
	double izracunajPovrsinuKruga(double r) {
		double povrsina=r*r*PI;
		return povrsina;
	}
	
	void ispisi50Puta(int a) {
		for (int i=1; i <= 50; i++)
		System.out.println(a);
	}
	
	void ispisi1Do100 () {
		for (int i=1; i<=100; i++)
			System.out.println(i);
	}
	
	static int suma(int n) {
		int s=0;
		for (int i=1; i <=n; i++ ) {
			s= s+i;
		}
		return s;
	}
	
	static double stepenX(double x, int n) {
		double p = 1;
		for (int i=1; i <=n; i++) {
			p = p * x;
		}
		return p;
	}
	
	static int minStepenDva(int n) {
		int x=1;
		
		while(x <= n) {
			x = x*2;
		}
		return x;
	}
	
	static void deliSaDva(int n) {
		while (n>1) {
			n = n/ 2;
			System.out.println(n);
		}
	}
	

}


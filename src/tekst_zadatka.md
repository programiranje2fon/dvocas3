# Laboratorijske vežbe – dvočas br. 3

## Zadatak 1
(radi ga laborant u saradnji sa studentima)

Napraviti klasu **SlozeniKalkulator** u paketu **zadatak1** koja ima:

1. Statičku konstantu **PI** koja ima vrednost 3.14. **(STATIC, FINAL, statičke konstante)**

2. Metodu **podeli** koja kao ulazne parametre dobija dva realna broja, deli prvi drugim i vraća rezultat.

3. Metodu **podeli** koja kao ulazne parametre dobija dva cela broja, deli prvi drugim i vraća rezultat kao ceo broj. 

4. Metodu **podeliMod** koja kao ulazne parametre dobija dva cela broja, deli prvi drugim i vraća ostatak pri deljenju kao rezultat.

5. Metodu **izracunajObimKruga** koja kao ulazni parametar dobija poluprečnik kruga, računa njegov obim i vraća ga kao rezultat.

6. Metodu **izracunajPovrsinuKruga** koja kao ulazni parametar dobija poluprečnik kruga, računa njegovu površinu i vraća je kao rezultat.

7. Metodu **ispisi50Puta** koja na ekranu 50 puta ispisuje ceo broj koji dobija kao ulazni parametar. 

8. Metodu **ispisi1Do100** koja na ekranu ispisuje brojeve od 1 do 100. 

9. Statičku metodu **suma** koja kao parametar dobija ceo broj N i računa i vraća sumu S(N) = 1+2+3+4+5+...+(N-1)+N 

10. Statičku metodu **stepenX** koja kao parametre dobija realan broj X i ceo broj N i računa i vraća X na N-ti stepen (pri čemu N nije negativan broj).

11. Statičku metodu **minStepenDva** koja kao parametar dobija ceo broj N. Ova metoda povećava stepen broja 2 u svakoj iteraciji i vraća prvi dobijeni broj koji je veći od zadatog broja. Zadati broj se daje u vidu ulaznog argumenta.
Primer: ako je zadat broj 6, metoda vraća 8 (2 na treći stepen) jer je to najmanje 2 na n koje je veće od 6.

12. Statičku metodu **deliSaDva** koja kao ulazni argument dobija ceo broj, deli ga brojem dva sve dok broj ostaje veći od 1, i ispisuje na ekranu rezultat posle svakog deljenja. Primer: ako se unese broj 33, metoda ispisuje 16 (rezultat prvog deljenja sa dva), 8 (rezultat drugog deljenja sa dva), 4 (rezultat trećeg deljenja sa dva), 2 (rezultat četvrtog deljenja sa dva) i 1 (rezultat poslednjeg deljenja sa dva).

Napraviti klasu **TestSlozeniKalkulator** u paketu **zadatak1** koja poziva jednu statičku i jednu običnu metodu klase SlozeniKalkulator.


## Zadatak 2
(rade ga studenti sami)

Napraviti klasu **SlozeniKalkulator2** u paketu **zadatak2** koja ima:

1. Metodu **ispisi55Do0** koja na ekranu ispisuje brojeve od 0 do 55, ali u obrnutom redosledu (55,54,53,52....1,0).

2. Statičku metodu **faktorijel** koja kao parametar dobija ceo broj N i računa i vraća njegov faktorijel:  N! = 1*2*3*4*5...*(N-1)*N

3. Statičku metodu **ABN** koja kao parametre dobija cele brojeve A i B i N računa i vraća (A+B) na N-ti stepen (pri čemu N nije negativan broj).

Napraviti klasu **TestSlozeniKalkulator2** u paketu **zadatak2** koja poziva druge dve metode klase SlozeniKalkulator2.
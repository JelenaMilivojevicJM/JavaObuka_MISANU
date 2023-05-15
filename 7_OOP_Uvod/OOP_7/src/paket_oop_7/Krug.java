package paket_oop_7;

//Kljucna rec THIS JE REFERENCA koja pruza informacije metdoi koji tacno objekat da koristi
//To je nacin kako metoda zna tacno koji objekat je pozvao metodu
/**
 * This * * Kljucna rec this ili referenca this pruza nacin da metoda zna koji
 * tacno objekat je pozvao metodu, tj sa cijim podacima radi. * Takodje, moze se
 * koristiti za pristup podacima objekta koji su sakriveni lokalnim
 * promenljivama ili parametrima metode. * * Takodje, odnosi se na trenutni
 * objekat u metodi ili konstruktoru.
 */
public class Krug {

	private double poluprecnik;

	// Pravljenje konstruktorA:
	// Ima isto ime kao i naziv klase
	Krug() {
		this.poluprecnik = 10.00;
	}

	// metoda kojom se racuna povrsina
	public double areathis() {
		return 3.14 * poluprecnik * poluprecnik;
	}
}
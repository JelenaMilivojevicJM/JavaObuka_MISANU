package paket;
// Apstraktna klasa koja definiše zajedničko ponašanje za sve vrste sladoleda

public abstract class Sladoled {
	// Apstraktna metoda koja mora biti implementirana u svim konkretnim klasama
	// koje nasleđuju ovu klasu
	public abstract void pripremi();

	// Metoda koja definiše zajedničko ponašanje za sve vrste sladoleda
	public void pakovanje() {
		System.out.println("Pakovanje sladoleda . . .");
	}
}

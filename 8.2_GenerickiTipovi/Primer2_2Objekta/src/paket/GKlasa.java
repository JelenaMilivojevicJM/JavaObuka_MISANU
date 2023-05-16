package paket;

public class GKlasa<T> {
	// Atribut/Polje genericke klase
	T atribut;

	// Parametruzovani Konstruktor Genericke klase
	GKlasa(T atribut) {
		this.atribut = atribut;
	}

	// Setter
	public void setAtribut(T atribut) {
		this.atribut = atribut;
	}

	// Getter
	public T getAtribut() {
		return atribut;
	}

	// Metoda
	public void prikaziTip() {
		System.out.println("Postavljeni Tip atrubuta " + atribut + " je: " + atribut.getClass().getName());
	}
}

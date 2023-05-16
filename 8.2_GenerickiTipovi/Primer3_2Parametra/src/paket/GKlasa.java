package paket;

public class GKlasa<T1, T2> {

	// Atribut/Polje genericke klase
	T1 atribut1;
	T2 atribut2;

	// Parametruzovani Konstruktor Genericke klase
	GKlasa(T1 atribut1, T2 atribut2) {
		this.atribut1 = atribut1;
		this.atribut2 = atribut2;
	}

	// Setter1
	public void setAtribut1(T1 atribut1) {
		this.atribut1 = atribut1;
	}

	// Getter1
	public T1 getAtribut1() {
		return atribut1;
	}

	// Setter2
	public void setAtribut2(T2 atribut2) {
		this.atribut2 = atribut2;
	}

	// Getter2
	public T2 getAtribut2() {
		return atribut2;
	}

	// Metoda
	public void prikaziTip() {
		System.out.println("Postavljeni Tip1 atrubuta1 " + atribut1 + " je: " + atribut1.getClass().getName());
		System.out.println("Postavljeni Tip2 atrubuta2 " + atribut2 + " je: " + atribut2.getClass().getName());
	}
}

package paket;

public class OpisnaOcena<T1, T2> {

	T1 ocena;
	T2 opisnaOcena;

	OpisnaOcena(T1 ocena, T2 opisnaOcena) {
		this.ocena = ocena;
		this.opisnaOcena = opisnaOcena;
	}

	public T1 getOcena() {
		return ocena;
	}

	public void setOcena(T1 ocena) {
		this.ocena = ocena;
	}

	public T2 getOpisnaOcena() {
		return opisnaOcena;
	}

	public void setOpisnaOcena(T2 opisnaOcena) {
		this.opisnaOcena = opisnaOcena;
	}

	public void prikaziTip() {
		System.out.println("Tip za vrednost " + ocena + " je: " + ocena.getClass().getName());
		System.out.println("Tip za vrednost " + opisnaOcena + " je: " + opisnaOcena.getClass().getName());
	}
}

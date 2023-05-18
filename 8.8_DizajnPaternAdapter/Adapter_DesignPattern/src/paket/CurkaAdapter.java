package paket;

/* 1. Prvo se implementira interfejs tipa prema kojem se vrsi prilagodjavanje.
 * Interface tipa, to je onaj interface koji klijent ocekuje */
public class CurkaAdapter implements Patka {

	/* 2. Dobiti referencu na objekat koji prilagodjavamo */
	Curka curka;

	/*
	 * 3.Implememntirati metode zeljenog interface-a. Implementacija metoda u
	 * interfejsu
	 */
	public CurkaAdapter(Curka curka) {
		this.curka = curka;
	}

	/* Prevodjenje kvace()* u metodu curlice() izmedju klasa */
	public void kvace() {
		curka.curlice();
	}

	public void leti() {
		for (int i = 0; i < 5; i++) {
			curka.leti();
		}
	}

}
package paket_abs;

public class ApsolutnaVrednost {
	private int broj;

	public void setVrednost(int br) {
		broj = br;
	}

	public int getVrednost() {
		return broj;
	}

	public int racunajVrednost() {
		return Math.abs(broj);
	}

}

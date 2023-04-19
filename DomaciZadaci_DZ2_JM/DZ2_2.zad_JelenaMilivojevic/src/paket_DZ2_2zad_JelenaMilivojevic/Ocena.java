package paket_DZ2_2zad_JelenaMilivojevic;

public class Ocena {
	
	private int vrednost;

	public Ocena(int vrednost) {
		if (vrednost < 5) {
			this.vrednost = 5;
		} else if (vrednost > 10) {
			this.vrednost = 10;
		} else {
			this.vrednost = vrednost;
		}
	}

	public int getVrednost() {
		return vrednost;
	}

	public String toString() {
        String[] reci = {"jedan", "dva", "tri", "četiri", "pet", "šest", "sedam", "osam", "devet", "deset"};
        return vrednost + "(" + reci[vrednost-1] + ")";
    }

}

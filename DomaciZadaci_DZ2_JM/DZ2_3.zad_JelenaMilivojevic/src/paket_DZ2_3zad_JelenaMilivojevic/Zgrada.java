package paket_DZ2_3zad_JelenaMilivojevic;

public class Zgrada {
	private double povrsinaOsnove;
	private int brojSpratova;
	private int brojStanovaPoSpratu;

	public Zgrada(double povrsinaOsnove, int brojSpratova, int brojStanovaPoSpratu) {
		this.povrsinaOsnove = povrsinaOsnove;
		this.brojSpratova = brojSpratova;
		this.brojStanovaPoSpratu = brojStanovaPoSpratu;
	}

	public double getPovrsinaOsnove() {
		return povrsinaOsnove;
	}

	public int getBrojSpratova() {
		return brojSpratova;
	}

	public int getBrojStanovaPoSpratu() {
		return brojStanovaPoSpratu;
	}

	public int getUkupanBrojStanova() {
		return brojSpratova * brojStanovaPoSpratu;
	}

	public double getProsecnaPovrsinaStana() {
		return povrsinaOsnove / brojStanovaPoSpratu;
	}

	
	public String toString() {
		return povrsinaOsnove + "m2/" + brojSpratova + "/" + brojStanovaPoSpratu;
	}
}

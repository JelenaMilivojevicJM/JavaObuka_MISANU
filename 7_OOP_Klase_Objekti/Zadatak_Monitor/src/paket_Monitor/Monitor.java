package paket_Monitor;

public class Monitor {

	private String marka;
	private int velicinaEkrana;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		if (marka != null) {
			this.marka = marka;
		} else {
			System.out.print("Greska. Morate uneti marku.");
		}
	}

	public int getVelicinaEkrana() {
		return velicinaEkrana;
	}

	public void setVelicinaEkrana(int velicinaEkrana) {
		if (velicinaEkrana > 12) {
			this.velicinaEkrana = velicinaEkrana;
		} else {
			System.out.print("Greska. Velicina ekrana mora biti veca od 12");
		}
	}

	public String toString() {
		return "Podaci o monitoru: \nMarka: " + this.marka + "\nVelicina ekrana: " + this.velicinaEkrana + "''.";
	}
}

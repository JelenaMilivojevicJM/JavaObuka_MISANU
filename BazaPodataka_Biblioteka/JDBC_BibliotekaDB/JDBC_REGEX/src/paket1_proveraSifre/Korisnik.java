package paket1_proveraSifre;

public class Korisnik {

	// Polja
	private int korsnikID;
	private String nickName;
	private String sifra;
	private String email;

	// Konstruktor
	Korisnik(int korsnikID, String nickName, String sifra, String email) {
		super();
		this.korsnikID = korsnikID;
		this.nickName = nickName;
		this.sifra = sifra;
		this.email = email;
	}

	// Getteri
	public int getKorsnikID() {
		return korsnikID;
	}

	public String getNickName() {
		return nickName;
	}

	public String getSifra() {
		return sifra;
	}

	public String getEmail() {
		return email;
	}

	// Metoda za tekstualni ispis
	public String toString() {
		return "\n*KORISNIK*: | ID: " + korsnikID + " | nickName: " + nickName + " | Sifra: " + sifra + " | Email: "
				+ email;
	}
}

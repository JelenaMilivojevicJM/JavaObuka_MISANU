package paket_Radnik;

public class Radnik {

	private String ime;
	private double procenat;
	private double prihod;

	Radnik(String name, double percent, double money) {
		ime = name;
		procenat = percent;
		prihod = money;
	}

	public double getPrihod() {
		return prihod;
	}

	public double racunajPlatu() {
		return getPrihod() * procenat / 100;
	}

	public String opis() {
		return "Ime" + ime + "/" + racunajPlatu() + "";
	}
}

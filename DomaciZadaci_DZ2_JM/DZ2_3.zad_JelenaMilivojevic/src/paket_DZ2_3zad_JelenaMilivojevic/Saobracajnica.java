package paket_DZ2_3zad_JelenaMilivojevic;

public class Saobracajnica {
	private String ime;
    private int duzina;

    public Saobracajnica(String ime, int duzina) throws Izuzetak {
        if (ime.length() > 30) {
            throw new Izuzetak("Ime saobraćajnice ne sme biti duže od 30 karaktera.");
        }
        this.ime = ime;
        this.duzina = duzina;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) throws Izuzetak {
        if (ime.length() > 30) {
            throw new Izuzetak("Ime saobraćajnice ne sme biti duže od 30 karaktera.");
        }
        this.ime = ime;
    }

    public int getDuzina() {
        return duzina;
    }

    @Override
    public String toString() {
        return ime + " (" + duzina + "m)";
    }
}

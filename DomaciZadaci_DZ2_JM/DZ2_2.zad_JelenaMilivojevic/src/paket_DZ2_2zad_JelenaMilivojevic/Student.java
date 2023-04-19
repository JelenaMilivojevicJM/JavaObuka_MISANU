package paket_DZ2_2zad_JelenaMilivojevic;

public class Student {

	private String ime;
    private long indeks;
    private Ispit[] ispiti;
    private int kapacitet;
    private int brojIspita;

    public Student(String ime, long indeks) {
        this.ime = ime;
        this.indeks = indeks;
        this.ispiti = new Ispit[40];
        this.kapacitet = 40;
        this.brojIspita = 0;
    }

    public boolean dodajIspit(Ispit ispit) {
        if (brojIspita < kapacitet) {
            ispiti[brojIspita++] = ispit;
            return true;
        } else {
            return false;
        }
    }

    public double getSrednjaOcena() {
        if (brojIspita == 0) {
            return 0;
        }
        int zbirOcena = 0;
        for (int i = 0; i < brojIspita; i++) {
            zbirOcena += ispiti[i].getOcena().getVrednost();
        }
        return (double) zbirOcena / brojIspita;
    }

    public String toString() {
        String[] deloviIndeksa = {String.valueOf(indeks / 10000), String.valueOf(indeks % 10000)};
        return ime + "[" + deloviIndeksa[0] + "/" + deloviIndeksa[1] + ":" + String.format("%.2f", getSrednjaOcena()) + "]";
    }
}

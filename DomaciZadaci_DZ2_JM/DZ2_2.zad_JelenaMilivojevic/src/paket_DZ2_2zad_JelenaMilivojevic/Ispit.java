package paket_DZ2_2zad_JelenaMilivojevic;

public class Ispit {
	
	 private String sifra;
	    private Ocena ocena;

	    public Ispit(String sifra, Ocena ocena) {
	        this.sifra = sifra;
	        this.ocena = ocena;
	    }

	    public String getSifra() {
	        return sifra;
	    }

	    public Ocena getOcena() {
	        return ocena;
	    }

	    public String toStringIspit() {
	        return sifra + ":" + ocena.getVrednost();
	    }
}

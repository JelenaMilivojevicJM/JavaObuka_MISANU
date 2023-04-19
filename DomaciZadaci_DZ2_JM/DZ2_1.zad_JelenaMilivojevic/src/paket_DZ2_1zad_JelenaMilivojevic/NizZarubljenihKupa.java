package paket_DZ2_1zad_JelenaMilivojevic;

public class NizZarubljenihKupa {
	
	private ZarubljenaKupa[] niz;
	
    private int kapacitet;
    private int brojElemenata;
    
    public NizZarubljenihKupa() {
        kapacitet = 5;
        niz = new ZarubljenaKupa[kapacitet];
        brojElemenata = 0;
    }
    
    public NizZarubljenihKupa(int kapacitet) {
        this.kapacitet = kapacitet;
        niz = new ZarubljenaKupa[kapacitet];
        brojElemenata = 0;
    }
    
    public int getKapacitet() {
        return kapacitet;
    }
    
    public int getBrojElemenata() {
        return brojElemenata;
    }
    
    public boolean jePopunjen() {
        return brojElemenata == kapacitet;
    }
    
    public void dodajKupu(ZarubljenaKupa kupa) {
        if (jePopunjen()) {
            System.out.println("Niz je vec popunjen!");
            return;
        }
        niz[brojElemenata++] = kupa;
    }
    
    public ZarubljenaKupa getKupa(int i) {
        return niz[i];
    }
    
    public int najmanjaZapremina() {
        int minIndex = 0;
        for (int i = 0; i < brojElemenata; i++) {
            if (niz[i].manjaOd(niz[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public void prikaz() {
    	for (int i = 0; i < brojElemenata; i++) {
    		System.out.println(niz[i]);
            }
        }
    	
}

package dz1_1zad_paket1_JelenaM;

public class Vektor {

	// Atributi za granice indeksa
	int min;
	int max;

	/*vektor realnih brojeva (vektor je po definicji jednodimenzionalni niz
	komponenti */
	double nizV[];

	// Odredjivanje vrednosti opsega i provera izuzetaka za opseg vektora:
	public Vektor(int najmanji,int najveci) throws Izuzetak {
		// Izuzetak opsega
		if (najmanji > najveci) {
			throw new Izuzetak(Izuzetak.opseg);
		}
		// Dozvoljena vrednost opsega:
		nizV = new double[(max = najveci) - (min = najmanji) + 1];
	}

	// Gornja granica opsega:
	public Vektor(int najveci) throws Izuzetak {
		this(1, najveci);// od 1 do najveci-zadataka gornja granica
	}

	// Interval opsega od 1 do 10:
	public Vektor() throws Izuzetak {
		this(1, 10); // od 1 do 10
	}

	//Setter za postavljanje vrednosti komponente vektora sa zadatim indexom:
	public Vektor setKomponenta(int indx, double komp[]) throws Izuzetak{
		if(indx<min || indx>max) {
			throw new Izuzetak(Izuzetak.indeks);
		}
		for(int i = min; i<=max; i++) {
			nizV[indx-min] = komp[i];
		}
		
		return this;
	}
	
	//Getter za dohvatanje vrednosti komponente sa zadatim indexom:
	//*komponenta niza je double tip jer nam treba jdniz odnosno vektor realnih brojeva
	public double getKomponenta(int indx)throws Izuzetak {
		if(indx<min || indx>max) {
			throw new Izuzetak(Izuzetak.indeks);
		}
		return nizV[indx-min];
	}
	
	//Metoda za racunanje skalarnog proizvoda dva vektora:
	public static double skalarniProizvod(Vektor v1, Vektor v2) throws Izuzetak{
		//AKo vektori nisu iste duzine onda ne mogu da se pomnoze te bacamo izuzetak
		if(v1.nizV.length != v2.nizV.length) {
			throw new Izuzetak(Izuzetak.duzina);
		}
		//Ako vektori jesu iste duzine:
		double skalar = 0;
		for(int i =0; i<v1.nizV.length; skalar += v1.nizV[i]*v2.nizV[i++]); 
		return skalar;
	}
	
	//Dohvatanje granicnih vrednosti indeksa:
	
	//Max granicna vrednost
	public int maxI() {
		return max;
	}
	
	//Min granicna vrednost
	public int minI() {
		return min;
	}
}

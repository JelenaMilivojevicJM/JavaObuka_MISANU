package dz1_5zad_paket1_JelenaM;

public abstract class Oblast extends Naselje {

	/*- Apstraktna oblast je teritorijalna jedinica koja sadrži zadat broj drugih teritorijalnih jedinica. 
	 *  Stvara se prazna nakon čega joj se jedinice dodaju jedna po jedna (obl+=jed; prekoračenje kapaciteta je greška)
	 *   uz proveru da li se jedinica sme dodati. Proveru određuju konkretne oblasti. 
	 *   Broj stanovnika oblasti je jednak zbiru broja stanovnika sadržanih jedinica.
	    Može da joj se odredi površina. U izlazni tok se piše u oblikunaziv:vrsta:brojSt:povrs[jed,…,jed],
	    gde jed šredstavlja rezultat pisanja jedne jedinice. */

	String jedinica;
	int kapacitetJedinicaUOblasti = 4;
	String oblast;
	String obl[] = new String[kapacitetJedinicaUOblasti];
	int brStPoJedinici;
	int brojSanovnikaTOblasti[] = new int[kapacitetJedinicaUOblasti];

	// Stvaranje prazne oblasti

	Oblast(String nazivTJ, int brojStanovnika) throws GreskaBrJedinica {
		super(nazivTJ,brojStanovnika);
		this.jedinica = nazivTJ;
		this.brStPoJedinici = brojStanovnika;

		for (int i = 0; i < kapacitetJedinicaUOblasti; i++) {
			obl[i] += jedinica;
			this.oblast = obl[i];
		}

		if (obl.length < kapacitetJedinicaUOblasti) {
			throw new GreskaBrJedinica(kapacitetJedinicaUOblasti);
		}

		// Dodavanje broja stanovnika u jedinice
		int brojSanovnikaTOblasti[] = new int[kapacitetJedinicaUOblasti];

		for (int i = 0; i < kapacitetJedinicaUOblasti; i++) {
			brojSanovnikaTOblasti[i] = brStPoJedinici;
		}
	}

	// Broj stanovnika oblasti je jednak zbiru broja stanovnika sadržanih jedinica.
	public int brojSt() {
		int ukupanBrSt = 0;
		for (int i = 0; i < kapacitetJedinicaUOblasti; i++) {
			ukupanBrSt += brojSanovnikaTOblasti[i];
		}
		return ukupanBrSt;
	}

	// Može da joj se odredi površina.
	public abstract double odrediPovrsinuOblasti();

	// U izlazni tok se piše u obliku naziv:vrsta:brojSt:povrs[jed,…,jed]
	public String opisOblasti() {
		return super.opisNaselja();
	}

}

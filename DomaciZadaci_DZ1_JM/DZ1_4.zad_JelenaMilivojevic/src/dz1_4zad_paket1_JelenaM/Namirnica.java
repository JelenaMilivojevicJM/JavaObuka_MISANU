package dz1_4zad_paket1_JelenaM;

import static java.lang.Math.random;

public abstract class Namirnica extends Energent {

	/*- Apstraktna namirnica je energent koji ima ime (niska znakova)
	 *  i jedinstven, automatski generisan celobrojan identifikator, koji mogu da se dohvate.
	 *    Tekstualni opis je ime_namirnice[id].*/

	String imeNamirnice;
	int identifikatorNamirnice = (int)(random()*100);
	
	Namirnica(){}
	
	Namirnica(String imeNamirnice){
		this.imeNamirnice = imeNamirnice;
	}

	public String dohvatiImeNamirnice() {
		return imeNamirnice;
	}

	public int dohvatiID() {
		return identifikatorNamirnice;
	}
	
	 public String opisNamirnice() {
    return imeNamirnice+"[ "+identifikatorNamirnice+" ]";
	}
	
	
}

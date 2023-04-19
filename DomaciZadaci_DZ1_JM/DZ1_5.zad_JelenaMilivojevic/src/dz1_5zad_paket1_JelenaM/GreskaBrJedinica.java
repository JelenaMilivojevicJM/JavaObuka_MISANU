package dz1_5zad_paket1_JelenaM;

public class GreskaBrJedinica extends Throwable {

	int limitTJedinicaUOblasti;//npr 5 
	
	GreskaBrJedinica(int limitTJedinicaUOblasti){
		this.limitTJedinicaUOblasti=limitTJedinicaUOblasti;
	}
	
	public String toSTring() {
		return "Greska! Prekoračenje kapaciteta oblasti!";
	}
	
	}

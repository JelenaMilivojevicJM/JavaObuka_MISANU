package dz1_5zad_paket1_JelenaM;

public class Okrug extends Opstina{
	
	/*  Okrug je oblast koja sadrži samo opštine.
	 *  Površina oblasti je jednaka zbiru površina sadržanih opština. Oznaka vrste je 'K'. 
	 *  Pokušaj dodavanja neodgovarajuće jedinice je greška.*/
	
	String imeOkruga;
	int brOpstina;
	double povrstina1opstine;
	
	Okrug(String imeNaselja,int brSt,String imeOpstine,double povrstina1opstine,String imeOkruga) throws GreskaBrJedinica{
		super(imeNaselja,brSt,imeOpstine,povrstina1opstine);
		this.povrstina1opstine=povrstina1opstine;
		this.imeOkruga=imeOkruga;
	}

	//Dodavanje povrsina 1opstine 
	public double PovrsinaOkruga() {
		brOpstina = 2;
		double povrsinaOkruga = brOpstina*povrstina1opstine;
		return povrsinaOkruga;
	}
	

	@Override
	public char dohvatiVrstu() {
		return 'K';
	}
	
	@Override
	public double odrediPovrsinuOblasti() {
		return PovrsinaOkruga();
	}
	
	public String toStringOkrug() {
		return super.opisOpstine()+" : "+ imeOkruga;
	}
}

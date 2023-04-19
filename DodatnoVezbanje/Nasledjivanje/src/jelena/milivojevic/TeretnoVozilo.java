package jelena.milivojevic;

public class TeretnoVozilo extends Vozilo {

	double tezinaTerata;
	
	TeretnoVozilo(double tezinaVozila,double tezinaTereta){
		super(tezinaVozila);
		this.tezinaTerata=tezinaTerata;
	}

	@Override
	public char getVrsta() {
		return 'T';
	}

	@Override
	public double ukupnaTezina() {
		return tezinaVozila+tezinaTerata;
	}
	
	public String opis() {
		return super.opis()+". Tezina tereta: "+tezinaTerata+" Ukupne tezine: "+ukupnaTezina();
	}
	
	
}

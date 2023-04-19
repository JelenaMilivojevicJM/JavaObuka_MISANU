package jelena.milivojevic;

public class PutnickoVozilo extends Vozilo{

	int brojPutnika;
	double tezina1Putnika;
	
	PutnickoVozilo(double tezinaVozila,int brojPutnika,double tezina1Putnika){
		super(tezinaVozila);
		this.brojPutnika=brojPutnika;
		this.tezina1Putnika=tezina1Putnika;
	}

	@Override
	public char getVrsta() {
		return 'P';
	}

	@Override
	public double ukupnaTezina() {
		return tezinaVozila+(tezina1Putnika*(double)brojPutnika);
	}
	
	public String opis() {
		return super.opis()+"Tezina po putniku: "+tezina1Putnika+" Ukupne tezine: "+ukupnaTezina();
	}
}

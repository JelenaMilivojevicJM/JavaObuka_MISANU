package jelena.milivojevic;

public abstract class Vozilo {

	protected double tezinaVozila;
	
	Vozilo(double tezinaVozila){
		this.tezinaVozila = tezinaVozila;
	}
	
	public abstract char getVrsta();
	
	
	public abstract double ukupnaTezina();
	
	
	public String opis() {
		return "Ovo je vozilo vrste "+getVrsta()+", tezine t = "+tezinaVozila;
	}
}

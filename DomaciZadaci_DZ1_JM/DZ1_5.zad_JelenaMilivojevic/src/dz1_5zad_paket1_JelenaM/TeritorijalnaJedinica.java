package dz1_5zad_paket1_JelenaM;

public abstract class TeritorijalnaJedinica {

	/*-Apstraktna teritorijalna jedinica ima naziv (znakovni niz).
	 * Može da se dohvati jednoslovna oznaka vrste, 
	 * da se odredi broj stanovnika i da se upiše u izlazni tok u obliku naziv:vrsta:brojSt:. */
	
	
	String nazivTJ;
	int brojSt;
	
	TeritorijalnaJedinica(){}
	
	TeritorijalnaJedinica(String nazivTJ,int brojSt){
		this.nazivTJ=nazivTJ;
		this.brojSt=brojSt;
	}
	
	public abstract char dohvatiVrstu();
	
	public String opisTJ() {
		return nazivTJ+" : "+dohvatiVrstu()+" : "+brojSt+" : ";
	}
}

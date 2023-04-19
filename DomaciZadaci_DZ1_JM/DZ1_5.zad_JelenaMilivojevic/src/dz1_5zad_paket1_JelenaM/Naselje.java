package dz1_5zad_paket1_JelenaM;

public class Naselje extends TeritorijalnaJedinica{

	/*-Naselje je jednostavna teritorijalna jedinica 
	 * u kojoj živi zadati broj stanovnika. 
	 * Oznaka vrste je 'N'*/

	
	Naselje(String nazivTJ,int brojStanovnika){
		super(nazivTJ,brojStanovnika);
	}
	
	@Override
	public char dohvatiVrstu() {
		return 'N';
	}

	public String opisNaselja() {
		return super.opisTJ();
	}
	
}

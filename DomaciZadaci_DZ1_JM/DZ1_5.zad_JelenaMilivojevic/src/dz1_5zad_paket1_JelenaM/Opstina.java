package dz1_5zad_paket1_JelenaM;

public class Opstina extends Oblast{

	/* - Opština je oblast koja sadrži samo naselja i ima zadatu površinu.
	 *  Oznaka vrste je 'O'. 
	 */
	
	String imeNaselja;
	String imeOpstine;
	double  povrsinaOpstine;
	
	
	//Opstina se stvara prazna 
	Opstina(String imeNaselja,int brSt,String imeOpstine,double povrsinaOpstine) throws GreskaBrJedinica{
		super(imeNaselja,brSt);
		this.imeOpstine=imeOpstine;
		this.povrsinaOpstine=povrsinaOpstine;
	}
		@Override
		public char dohvatiVrstu() {
			char vrsta = 'O';
			return vrsta;
		}
		
		@Override
		public double odrediPovrsinuOblasti() {
			return povrsinaOpstine;
		}

	public String opisOpstine() {
		return super.opisOblasti()+imeOpstine+" : "+odrediPovrsinuOblasti();
	}
}

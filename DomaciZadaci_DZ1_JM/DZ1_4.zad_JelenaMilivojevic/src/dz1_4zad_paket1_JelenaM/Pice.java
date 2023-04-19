package dz1_4zad_paket1_JelenaM;
public class Pice extends Namirnica{

	/*- Piće je namirnica koje se zadaje količinom u litrima (realan broj) 
	 * i energetskom vrednošću jednog litra izraženoj u kJ (realan broj).
	 *  Može da se dohvati količina. 
	 *  Tekstualni opis je ime_pića[id](količina,energetska_vrednost). */
	
	
	double kolicina;
	double eVrednostjednogLitra;
	
	Pice(){}
	
	Pice(String imePica,double kolicina,double eVrednostjednogLitra){
		super(imePica);
		this.kolicina=kolicina;
		this.eVrednostjednogLitra =eVrednostjednogLitra;
	}
	
	//Može da se dohvati količina. 
	public double getKolicina() {
		return kolicina;
	}
	
	@Override
	//Redefinisana metoda koju je nasledio od svojih predaka
	//Vraca double vrednost za eng vrednost za 1 l
	public double odrediEnergetskuVrednost() {
		double energetskaVrednostPica = eVrednostjednogLitra*kolicina;
		return energetskaVrednostPica;
	}
	
	//Tekstualni opis : ime_pića[id](količina,energetska_vrednost).
	public String opisPica() {
   		 return super.opisNamirnice()+"( "+kolicina+" L, "+odrediEnergetskuVrednost()+" kJ)";
	}
	
	
}

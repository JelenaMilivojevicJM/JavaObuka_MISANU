package dz1_4zad_paket1_JelenaM;
public class Hrana extends Namirnica{

	/*- Hrana je namirnica koja se zadaje težinom date namernice izraženom u gramima (realan broj) 
	 * i procentualnim udelom belančevina, masti i ugljenih hidrata (realni brojevi) u ukupnoj težini.
	 *  Mogu da se dohvate težinski udeo belančevina, masti i ugljenih hidrata i ukupna težina */
	
	double ukTezina;
	double procB;
	double procM;
	double procUH;
	
	Hrana(){}
	
	Hrana(String imeH,double ukTezina){
		super(imeH);
		this.ukTezina=ukTezina;
	}

	public double getUkTezina() {
		return ukTezina;
	}

	
	public double getProcB() {
		procB = 1670;
		return procB;
	}

	public double getProcM() {
		procM = 3760;
		return procM;
	}

	public double getProcUH() {
		procUH = 1720 ;
		return procUH;
	}
	
	//Racunanje energetske vrednosti hrane:
	//Redefinisana metoda koju nasledjuje od klase Energent preko klase Namirnica
	public double odrediEnergetskuVrednost() {
		
		double evHrane = ukTezina*((getProcB()/100)+(getProcM()/100)+(getProcUH()/100));
		
		double proveraZbira = (getProcB()/100)+(getProcM()/100)+(getProcUH()/100);
		
		if(proveraZbira>100) {
			System.out.println("Greska! Zbir procentualnih udela belančevina, masti i gljenih hidrata prelazi 100%");
			//Greška je ako zbir procentualnih udela belančevina, masti i gljenih hidrata prelazi 100%.
		}
		return evHrane;
	}
	
	//Tekstualni opis je ime_hrane[id](težina,energetska_vrednost). 
	public  void opisHrane() {
		System.out.println( super.opisNamirnice()+"( "+ukTezina+" gr , "+odrediEnergetskuVrednost()+" kJ) ");
	}
	
}

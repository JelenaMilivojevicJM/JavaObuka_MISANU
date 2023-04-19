package predavanje22;

public class Tacka {

	private double x;
	private double y;
	
	//Podrazumevani Konstruktor
	Tacka(){	
	}
	
	//Konstruktor kojim dodeljujemo vrednost za X a Y je onda po defaultu = 0
	Tacka(double x){
		this.x = x;
	}

	//Konstruktor za dodelu vrednosti obema koordinatama
	Tacka(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//Metoda 1: Rastojanje od koordinatnog pocetka 
	double poteg() { 
		return Math.sqrt(x * x + y * y);
	}
	
	//Metoda 2: Rastojanje od jedne do druge tacke
	double Rastojanje(Tacka t){ return Math.sqrt(Math.pow(x - t.x, 2)) + Math.sqrt(Math.pow(y - t.y, 2)); }
}

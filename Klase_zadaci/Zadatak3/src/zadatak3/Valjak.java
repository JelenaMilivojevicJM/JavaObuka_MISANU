package zadatak3;

public class Valjak {
//Moje TACNO resenje
	private double poluprecnik;
	private double visina;
	
	Valjak(double pol, double vis){
		poluprecnik = pol;
		visina = vis;
	}
	
	public double getPoluprecnik() {
		return poluprecnik;
	}
	
	public double getVisina() {
		return visina;
	}
	
	public String Opis() {
		return "Popluprecnik = "+poluprecnik+"\nVisina = "+visina+"";
	}
	
	public double racunajZapreminu() {
		return poluprecnik*poluprecnik*3.14*visina;
	}
}

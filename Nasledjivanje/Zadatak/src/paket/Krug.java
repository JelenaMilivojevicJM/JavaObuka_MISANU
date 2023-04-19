package paket;
public class Krug extends Oblik { 
	public double poluprecnik; 
	
	public Krug(double poluprecnik) { 
		this.poluprecnik=poluprecnik;
		} 
	public double uzmiPovrsinu() { 
		return poluprecnik* poluprecnik*Math.PI; } }


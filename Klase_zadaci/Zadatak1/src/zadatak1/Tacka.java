package zadatak1;

public class Tacka {

	//deklarisanje koordinata kao atributa;
	private double x;
	private double y;
	
	//Konstruktor
	Tacka(double xx, double yy){
		x = xx;
		y = yy;
	}
	
	//Dohvatanje vrednosti koordinate X
	public double getX() {
		return x;
	}
	
	//Dohvatanje vrednosti koordinate Y
	public double getY() {
		return y;
	}
	
	public String konvertuj() {
		return "("+x+"+"+y+")";
	}
	/*
	public void ispisi(double x, double y) {
		System.out.println("X = "+getX()+"Y = "+getY());
	}*/
}

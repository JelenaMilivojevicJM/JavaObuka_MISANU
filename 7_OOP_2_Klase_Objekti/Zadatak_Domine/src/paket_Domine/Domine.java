package paket_Domine;

public class Domine {
	private int a;
	private int b;
	
	Domine(int aa, int bb) {
		a = aa;
		b = bb;
	}
	
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	
	public Domine okreni() {
		int t = a;
		a = b;
		b = t;
		return this;
	}
	

	public boolean jednakost(Domine d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}
	public String opis() {
		return "( "+a+", "+b+")";
	}
}
